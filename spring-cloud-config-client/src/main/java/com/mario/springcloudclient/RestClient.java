package com.mario.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mario A. Pineda on 1/19/24.
 */
@RestController
public class RestClient {

    @Value("${user.role}")
    private String role;

    @Value("${user.password}")
    private String password;

    @GetMapping("/whatrole/{username}")
    public String whatRole(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a(n) %s, " +
                        "but only if your password is '%s'!\n",
                username, role, password);
    }
}
