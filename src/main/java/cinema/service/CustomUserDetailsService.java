package cinema.service;

import cinema.model.Role;
import cinema.model.User;
import java.util.Optional;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userService.findByEmail(username);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }
        UserBuilder builder =
                org.springframework.security.core.userdetails.User.withUsername(username);
        builder.password(user.get().getPassword());
        builder.authorities(user.get().getRoles()
                .stream()
                .map(Role::getRoleName)
                .map(Role.RoleName::toString)
                .toArray(String[]::new));
        return builder.build();
    }
}
