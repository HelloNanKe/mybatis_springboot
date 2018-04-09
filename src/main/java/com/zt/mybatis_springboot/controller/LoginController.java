package com.zt.mybatis_springboot.controller;

import com.zt.mybatis_springboot.dao.CityDAO;
import com.zt.mybatis_springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/login")
@EnableAutoConfiguration
public class LoginController {

    @Autowired
    private CityDAO cityDAO;

    @RequestMapping(value = "/city")
    public List<City> getAllCity(){
        return cityDAO.selectAllCity();
    }
}
