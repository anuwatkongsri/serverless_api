/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serverless.api.model;

/**
 *
 * @author Anuwat_K
 */
public class VersionResponseRESTModel {

    private String applicationName;
    private String environment;
    private String version;
    private String buildTimestamp;
    private String logLevel;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildTimestamp() {
        return buildTimestamp;
    }

    public void setBuildTimestamp(String buildTimestamp) {
        this.buildTimestamp = buildTimestamp;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public String toString() {
        return "VersionResponse{" + "applicationName=" + applicationName + ", environment=" + environment + ", version=" + version + ", buildTimestamp=" + buildTimestamp + ", logLevel=" + logLevel + '}';
    }

}
