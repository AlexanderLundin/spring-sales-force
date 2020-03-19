package com.salesforce.controllers;


import com.salesforce.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@EnableOAuth2Sso
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/accounts")
    public List<LoginService.Account> accounts(OAuth2Authentication principal) {
        return loginService.accounts(principal);
    }
}
