/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.albinodevelopment.testwebservice.dao;

import java.util.Optional;

/**
 *
 * @author conno
 */
public interface DAO {
    
    int store(String message);
    String retrive(int index);
   
}
