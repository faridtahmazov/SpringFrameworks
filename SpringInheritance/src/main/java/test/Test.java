package test;

import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnectionMysql = appContext.getBean("mysqlConnector", DBConnection.class);
        System.out.println(dbConnectionMysql);

        System.out.println("******************************");

        DBConnection dbConnectionOracle = appContext.getBean("oracleConnector", DBConnection.class);
        System.out.println(dbConnectionOracle);
    }
}
