package com.spring.aaharaSetu.controller;

import com.spring.aaharaSetu.controller.base.BaseController;
import com.spring.aaharaSetu.model.User;
import com.spring.aaharaSetu.service.UserService;
import com.spring.aaharaSetu.service.base.BaseServiceImp;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController extends BaseController<User, Integer> {

    UserService userService;
    protected UserController(BaseServiceImp<User, Integer> service) {
        super(service);
        userService = (UserService) service;
    }
}

