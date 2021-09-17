package com.nana.oauth.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        git  registry.addMapping("/**")
                .allowedOrigins("https://cheezburger.com")
                .allowedMethods("GET", "POST")
                .allowCredentials(false).maxAge(3600);;
    }
}