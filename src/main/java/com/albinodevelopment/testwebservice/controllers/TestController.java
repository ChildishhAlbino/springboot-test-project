/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.albinodevelopment.testwebservice.controllers;

import com.albinodevelopment.testwebservice.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author conno
 */
@RestController
public class TestController {
    
    @Autowired
    private TestService service;
    
    @RequestMapping("/data/{index}")
    public String getTestData(@PathVariable int index){
        return service.getServiceData(index);
    }
    
    
    
}
