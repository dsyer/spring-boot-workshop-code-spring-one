package io.pivotal.workshop.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResourceController {

    @GetMapping("/")
    public String helloSecured() {
        return "Hello - Secured";
    }

}
