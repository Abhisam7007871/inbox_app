package com.avshek.inbox_app.inbox;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.File;
@Configuration
@ConfigurationProperties(prefix = "datastax.astra")
@EnableConfigurationProperties(DataStaxAstraProperties.class)
public class DataStaxAstraProperties {

    private File secureConnectBundle;

    public File getSecureConnectBundle() {
        if (this.secureConnectBundle == null) {
            this.secureConnectBundle = new File("path/to/your/secure-connect-bundle.zip");
        }
        return this.secureConnectBundle;
    }

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }
}