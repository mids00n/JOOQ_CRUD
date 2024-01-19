package com.example.dada.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "postgresql")
public class DatabasePropeties {

    private String url;
    private String username;
    private String password;
}