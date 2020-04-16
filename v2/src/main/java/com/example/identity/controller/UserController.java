package com.example.identity.controller;

import java.util.*;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Geoffrey Rekier on 16/04/2020.
 */
@RestController
public class UserController {

    @GetMapping("/me")
    public Map<String, Object> me(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("email", principal.getAttribute("email"));
    }
}
