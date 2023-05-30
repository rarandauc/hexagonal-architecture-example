package co.edu.ucatolica.hexa.application.ports.input;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface GetUserDetailsUseCase {
    UserDetailsService userDetailsService();
}
