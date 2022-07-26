package com.cicd.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class Controller {

    private final Service service;

    @GetMapping("/")
    public User hello() {
        return service.join(User.toEntity("sdm"));
    }

}
