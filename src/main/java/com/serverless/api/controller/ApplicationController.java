/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serverless.api.controller;

import com.serverless.api.model.VersionResponseRESTModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Anuwat_K
 */
@RestController
public class ApplicationController {

    @Value("${bulid.enviromment}")
    private String env;

    @Value("${bulid.name}")
    private String appName;

    @Value("${bulid.version}")
    private String appVersion;

    @Value("${bulid.timestamp}")
    private String appTimestamp;

    @Value("${logging.level.root}")
    private String logLevel;

    private Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @GetMapping("/version")
    @ResponseBody
    public VersionResponseRESTModel getVersion() throws Exception {

        VersionResponseRESTModel versionResponse = new VersionResponseRESTModel();
        versionResponse.setApplicationName(appName);
        versionResponse.setEnvironment(env);
        versionResponse.setVersion(appVersion);
        versionResponse.setBuildTimestamp(appTimestamp);
        versionResponse.setLogLevel(logLevel);

        logger.info(versionResponse.toString());

        return versionResponse;
    }
}
