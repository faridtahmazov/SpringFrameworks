package test;

import appConfig.AppConfig;
import model.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ConfigurableApplicationContext appContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Database database = appContext.getBean("database", Database.class);
//        database.getInfo();
//
//        appContext.close();

        ConfigurableApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Database database = appContext.getBean(Database.class);
        database.getInfo();

        appContext.close();
    }
}
