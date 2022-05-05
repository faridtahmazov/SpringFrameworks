package test;

import appConfig.AppConfig;
import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        System.out.println("---XML---");
        setValueWithSpringCoreXml();

        System.out.println();

        System.out.println("---Annotation---");
        setValueWithSpringCoreAnnotation();
    }

    public static void setValueWithSpringCoreXml(){
        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection = appContext.getBean("dbConnection", DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }

    public static void setValueWithSpringCoreAnnotation(){
        ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection dbConnection = appContext.getBean("dbConnection", DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }
}
