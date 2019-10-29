/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.albinodevelopment.testwebservice.services;

import com.albinodevelopment.testwebservice.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author conno
 */
@Service
public class TestService {
    
    @Autowired
    private DAO dao;

    public String getServiceData(int index) {
        return dao.retrive(index);
    }

    public void setServiceData(String serviceData) {
        dao.store(serviceData);
    }
}
