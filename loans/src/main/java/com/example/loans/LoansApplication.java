package com.example.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@OpenAPIDefinition(
        info = @Info(
                title = "Loans Microservice OpenAPI Documentation",
                description = "Loans Microservice OpenAPI Documentation",
                version = "v1",
                contact = @Contact(
                        name = "John Doe",
                        email = "johndoe@example.com",
                        url = "https://test.example.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://test.example.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Loans Microservice OpenAPI Documentation",
                url = "http://localhost:8090/swagger-ui/index.html"
        )
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
