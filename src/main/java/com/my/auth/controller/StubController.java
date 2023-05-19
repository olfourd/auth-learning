package com.my.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StubController {

    @GetMapping("/public")
    public String getPublicData() {
        return "Public data";
    }

    @GetMapping("/private")
    public String getPrivateData() {
        return "Public data";
    }

    @GetMapping("/restricted")
    public String getRestrictedData() {
        return "Restricted data";
    }
}
