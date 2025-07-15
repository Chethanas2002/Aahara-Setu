package com.spring.aaharaSetu.controller;

import com.spring.aaharaSetu.controller.base.BaseController;
import com.spring.aaharaSetu.model.Reel;
import com.spring.aaharaSetu.service.ReelService;
import com.spring.aaharaSetu.service.base.BaseServiceImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reel")
class ReelController extends BaseController<Reel, Integer> {

    ReelService reelService;
    protected ReelController(BaseServiceImp<Reel, Integer> service) {
        super(service);
        reelService = (ReelService) service;
    }
}

