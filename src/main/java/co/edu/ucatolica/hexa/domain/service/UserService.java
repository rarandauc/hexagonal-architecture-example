package co.edu.ucatolica.hexa.domain.service;

import co.edu.ucatolica.hexa.application.ports.input.GetUserDetailsUseCase;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements GetUserDetailsUseCase {
    private final UserRepository userRepository;
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("Usuario No encontrado"));
            }
        };
    }
}
