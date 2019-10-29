/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.albinodevelopment.testwebservice.dao;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author conno
 */
@Component
@Primary
public class VolatileDAO implements DAO {

    private final List<String> store = Arrays.asList("Service Data One");

    @Override
    public int store(String message) {
        return store.add(message) ? 1 : 0;
    }

    @Override
    public String retrive(int index) {
        try {
            return store.get(index);
        } catch (ArrayIndexOutOfBoundsException ex) {
            return "yikes";
        }
    }
    
}
