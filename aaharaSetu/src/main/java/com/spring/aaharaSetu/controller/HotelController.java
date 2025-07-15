package com.spring.aaharaSetu.controller;

import com.spring.aaharaSetu.controller.base.BaseController;
import com.spring.aaharaSetu.model.Hotel;
import com.spring.aaharaSetu.service.HotelService;
import com.spring.aaharaSetu.service.base.BaseServiceImp;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HotelController extends BaseController<Hotel, Integer> {

    HotelService hotelService;
    protected HotelController(BaseServiceImp<Hotel, Integer> service) {
        super(service);
        hotelService = (HotelService) service;
    }
}

