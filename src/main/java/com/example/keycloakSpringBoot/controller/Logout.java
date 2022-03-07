package com.example.keycloakSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Logout {
    private static final Logger LOGGER = LoggerFactory.getLogger(Logout.class);
    @GetMapping(path = "/logout")
    @RolesAllowed("user")
    public String logout(HttpServletRequest request) throws ServletException {
        LOGGER.info("Here logout");
        request.logout();
        return "log out success";
    }

}
