package appConfig;

import beanFactory.BeanFactory;
import model.DBConnection;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import postProcessor.PostProcessor;

@Configuration
public class AppConfig {
    @Bean(initMethod = "validation", destroyMethod = "closeConnection")
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();
        dbConnection.setUrl("link");
        dbConnection.setUsername("haha");
        dbConnection.setPassword("12345");

        return dbConnection;
    }

    @Bean
    public BeanFactoryPostProcessor beanFactory(){
        return new BeanFactory();
    }

    @Bean
    public BeanPostProcessor beanPostProcessor(){
        return new PostProcessor();
    }




}
