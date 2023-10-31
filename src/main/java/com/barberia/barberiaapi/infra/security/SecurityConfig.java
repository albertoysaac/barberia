package com.barberia.barberiaapi.infra.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    protected void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .requestMatchers("/index", "/producto");
    }
}

