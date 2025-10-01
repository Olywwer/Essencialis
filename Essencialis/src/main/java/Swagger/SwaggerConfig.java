package Swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI essencialisOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Essencialis API")
                        .description("Documentação da API de Pessoas - Projeto Essencialis")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Reginaldo")
                                .email("reginaldo@essencialis.com.br")
                                .url("https://essencialis.com.br"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
