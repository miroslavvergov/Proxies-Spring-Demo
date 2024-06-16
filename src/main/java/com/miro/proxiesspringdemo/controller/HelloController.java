package com.miro.proxiesspringdemo.controller;

import com.miro.proxiesspringdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    final IUserService iUserService;

    public HelloController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping("/hello")
    public void hello() {
        iUserService.hello();
    }
}
