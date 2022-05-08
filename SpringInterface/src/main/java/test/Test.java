package test;

import dao.DBConnection;
import daoImpl.MysqlDBConnectionImpl;
import daoImpl.OracleDBConnectionImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DBConnection dbConnection = appContext.getBean("oracleConnection", OracleDBConnectionImpl.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }
}
