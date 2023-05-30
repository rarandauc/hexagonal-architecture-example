package co.edu.ucatolica.hexa.infra.adapters.input.rest;

import co.edu.ucatolica.hexa.domain.model.request.SignUpRequest;
import co.edu.ucatolica.hexa.domain.model.request.SigninRequest;
import co.edu.ucatolica.hexa.domain.model.response.JwtAuthenticationResponse;
import co.edu.ucatolica.hexa.domain.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest request) {
        try{
            return ResponseEntity.ok(authenticationService.signin(request));
        }catch (IllegalArgumentException e){
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body(new JwtAuthenticationResponse(e.getMessage()));
        }

    }
}
