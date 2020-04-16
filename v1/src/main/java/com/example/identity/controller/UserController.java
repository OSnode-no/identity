package com.example.identity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Geoffrey Rekier on 16/04/2020.
 */
@RestController
public class UserController {

    @GetMapping(value = "/me")
    public UserDetails getOidcUserPrincipal(@AuthenticationPrincipal UserDetails principal) {
        return principal;
    }
}
