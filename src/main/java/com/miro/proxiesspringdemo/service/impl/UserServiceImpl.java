package com.miro.proxiesspringdemo.service.impl;

import com.miro.proxiesspringdemo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public void hello() {
        System.out.println("Hello !");
    }
}
