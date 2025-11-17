package dev.sadiq.user_management;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    servers = {
        @Server(url = "https://userrestapi-production.up.railway.app")
    }
)
public class OpenApiConfig {}

