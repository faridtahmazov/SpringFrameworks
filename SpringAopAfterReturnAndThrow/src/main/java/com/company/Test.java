package com.company;

import com.company.appConfig.AppConfig;
import com.company.model.User;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserRepository userRepository = appContext.getBean("userRepository", UserRepository.class);
        User user = new User("Farid", "tahmazovfarid", 19);
        User user2 = null;
        userRepository.save(user2);
        System.out.println("---------------");
        userRepository.find(0);
        System.out.println("---------------");

    }
}
