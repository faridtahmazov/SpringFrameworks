package com.company;

import com.company.appConfig.AppConfig;
import com.company.model.Product;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.repository.ProductRepository;

public class Test {
    public static void main(String[] args) {
//        ConfigurableApplicationContext appContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
        ConfigurableApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = appContext.getBean("productRepository", ProductRepository.class);
        Product product = new Product("Iphone 13 Pro Max", 3000.00, 17, "IOS");
        productRepository.save(product);

        productRepository.find(0);

        appContext.close();
    }
}
