![cinema app logo](readme.images/cinema-project.png)

# Π‘inema App
Simple WEB application that supports registration, authentication and CRUD operations.

## π‘ Endpoints:
- [x]  login/register user
- [x]  /cinema-halls create/getAll
- [x]  /movies create/getAll
- [x]  /movie-sessions create/update/delete/getAllAvailable
- [x]  /orders completeOrder/getOrderHistory
- [x]  /shopping-carts addToCart/getByUser
- [x]  /users getByEmail

## π Project structure: 
- DAO - Data access layer
- Service - Application logic layer
- Controllers - Presentation layer

## π Used Technologies:
* Java 11
* Apache Maven
* Apache Tomcat
* MySQL
* Spring Core
* Spring MVC
* Spring Security
* Hibernate

## π¬ How to run a project? 
1. Clone this project.
2. Install MySQL or any other relational database compatible with Hibernate.
3. Configure db.properties with your credentials.
4. Configure tomcat server. I suggest using 9.0.50 versions. For versions above 9 you may need to change dependencies.
5. You already have registered two users (alice@gmail.com 1234 ROLE_USER and admin@gmail.com 
admin123 ROLE_ADMIN)
6. Or you can add users and roles manually.
7. Done! Run and enjoy! π

