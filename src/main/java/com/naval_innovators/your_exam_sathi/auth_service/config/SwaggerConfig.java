package com.naval_innovators.your_exam_sathi.auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {
	 @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	            .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
	            .components(new Components().addSecuritySchemes("bearerAuth",
	                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
	            .info(new Info().title("Your API").version("1.0").description("API documentation for your Spring Boot application"));
	    }
}