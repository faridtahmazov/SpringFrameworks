package com.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import bean.DBConnection;

@Configuration
public class AppConfig {
    @Bean
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();

        return dbConnection;
    }
}
