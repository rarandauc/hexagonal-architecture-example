package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.request.SignUpRequest;
import co.edu.ucatolica.hexa.domain.model.request.SigninRequest;
import co.edu.ucatolica.hexa.domain.model.response.JwtAuthenticationResponse;

public interface AuthenticationUseCase {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
