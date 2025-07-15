package com.spring.aaharaSetu.controller;

import com.spring.aaharaSetu.controller.base.BaseController;
import com.spring.aaharaSetu.model.City;
import com.spring.aaharaSetu.service.CityService;
import com.spring.aaharaSetu.service.base.BaseServiceImp;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CityController extends BaseController<City, Integer> {

    CityService cityService;
    protected CityController(BaseServiceImp<City, Integer> service) {
        super(service);
        cityService = (CityService) service;
    }
}