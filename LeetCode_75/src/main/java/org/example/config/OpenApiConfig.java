package org.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("String Utility API")
                        .description("APIs for merging strings, finding GCD of strings, and more.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Supriya Karagave")
                                .email("supriya@example.com")));
    }
}