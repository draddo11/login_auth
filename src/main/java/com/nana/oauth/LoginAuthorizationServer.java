package com.nana.oauth;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAuthorizationServer
public class LoginAuthorizationServer extends AuthorizationServerConfigurerAdapter {
    @Value("${security.jwt.client-id}")
    private String clientId;
}
