package test;

import appConfig.AppConfig;
import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ConfigurableApplicationContext appContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//       // model.DBConnection dbConnection = appContext.getBean("dbConnection", model.DBConnection.class);
//
//        appContext.close();

        ConfigurableApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DBConnection dbConnection = appContext.getBean(DBConnection.class);
        appContext.close();
    }
}
