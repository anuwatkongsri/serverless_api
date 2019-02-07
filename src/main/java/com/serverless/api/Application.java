/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serverless.api;

import com.serverless.api.controller.ApplicationController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 *
 * @author Anuwat_K
 */
@SpringBootApplication
@Import({ApplicationController.class})
public class Application extends SpringBootServletInitializer {

    //silence console logging
    @Value("${logging.level.root:OFF}")
    String message = "";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
