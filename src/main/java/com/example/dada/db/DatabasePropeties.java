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

    public String url;
    public String username;
    public String password;
}