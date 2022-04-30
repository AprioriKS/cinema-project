package cinema.dao.impl;

import cinema.dao.TicketDao;
import cinema.exception.DataProcessingException;
import cinema.model.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl implements TicketDao {
    private final SessionFactory factory;

    public TicketDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Ticket add(Ticket ticket) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(ticket);
            transaction.commit();
            return ticket;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert ticket " + ticket, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
