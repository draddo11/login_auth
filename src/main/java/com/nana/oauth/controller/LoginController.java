package com.nana.oauth.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
public class LoginController {
    @RolesAllowed("USER")
    @RequestMapping("/**")
    public String getUser()
    {
        return "Welcome User";
    }

    @RolesAllowed({"USER","ADMIN"})
    @RequestMapping("/admin")
    public String getAdmin()
    {
        return "Welcome Admin";
    }

    @RequestMapping("/*")
    public String getGithub(Principal user)
    {
        return  user.toString();
    }
}
