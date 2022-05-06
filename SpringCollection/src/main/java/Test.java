import model.DBConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection = appContext.getBean("dbConnection", DBConnection.class);
        dbConnection.openConnection();
    }
}
