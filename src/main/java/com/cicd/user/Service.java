package com.cicd.user;

import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final Repository repository;

    public User join(User user) {
       return repository.save(user);
    }
}
