package com.example.identity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

/**
 * Created by Geoffrey Rekier on 16/04/2020.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests( a -> {
                    a.antMatchers("/", "/login", "/error", "/oauth2/**", "/webjars/**", "/favicon.ico", "/actuator/**").permitAll();
                    //a.antMatchers("/me", "/favicon.ico", "/actuator/**").permitAll();
                    a.anyRequest().authenticated();
                })
                .exceptionHandling( e -> {
                    e.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
                })
                .oauth2Login();
    }
}
