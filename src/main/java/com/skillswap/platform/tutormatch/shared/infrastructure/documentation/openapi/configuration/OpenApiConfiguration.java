package com.skillswap.platform.tutormatch.shared.infrastructure.documentation.openapi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI SkillSwapPlatformOpenApi() {
        // General configuration
        var openApi = new OpenAPI();
        openApi
                .info(new Info()
                        .title("SkillSwapINC TutorMatch API")
                        .description("SkillSwapINC TutorMatch application REST API documentation.")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")
                                .url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SkillSwapINC TutorMatch wiki Documentation")
                        .url("https://github.com/SkillSwapINC/TutorMatch-Report"))
                .addServersItem(new Server()
                        .url("https://tutormatch-backend-production.up.railway.app")
                        .description("Railway Production Server"));

        // Add security scheme

        /*final String securitySchemeName = "bearerAuth";

        openApi.addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName,
                                new SecurityScheme()
                                        .name(securitySchemeName)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")));*/

        // Return OpenAPI configuration object with all the settings

        return openApi;
    }
}
