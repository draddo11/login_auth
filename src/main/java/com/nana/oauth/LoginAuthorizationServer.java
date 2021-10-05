package com.nana.oauth;

import org.springframework.context.annotation.Configuration;
//TODO configure

//@Configuration
//@EnableAuthorizationServer
//public class LoginAuthorizationServer extends AuthorizationServerConfigurerAdapter {
//    @Value("${security.jwt.client-id}")
//    private String clientId;
//
//    @Value("${security.jwt.client-secret}")
//    private String clientSecret;
@Autowired
private AuthenticationManager authenticationManager;
//}
