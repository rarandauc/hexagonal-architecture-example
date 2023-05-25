package co.edu.ucatolica.hexa;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HexaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexaApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("prueba de swagger spring boot 3 API")
						.version("1.0.0")
						.description("Ejemplo swagger construcción de software")
						.termsOfService("https://swagger.io/terms")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
