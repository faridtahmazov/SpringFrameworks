package Test;

import appConfig.AppConfig;
import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;

public class Test {
    public static void main(String[] args) {
//        ConfigurableApplicationContext appContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        DBConnection dbConnection = appContext.getBean("dbConnection", DBConnection.class);
//
//        dbConnection.openConnection();

        ConfigurableApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DBConnection dbConnection = appContext.getBean(DBConnection.class);
        dbConnection.openConnection();
    }
}
