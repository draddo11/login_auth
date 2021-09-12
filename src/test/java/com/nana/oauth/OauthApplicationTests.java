package com.nana.oauth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nana.oauth.controller.LoginController;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class OauthApplicationTests {

    @Autowired
    private LoginController controller;

    @Test
   public void contextLoads() {
    }

}
