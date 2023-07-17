package com.hclsw.v1.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/user1")
    @RolesAllowed("admin")
    public String testing1(){
        return "success for user 1";
    }

    @GetMapping("/user2")
    public String testing2(){
        return "success for user 2";
    }
}
