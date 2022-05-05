import bean.DBConnection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringXml {
    public static void main(String[] args) {
        System.out.println("---------- XML ----------");

        System.out.println("Bean Factory: ");
        createObjWithBeanFactoryInSpring();
        System.out.println("----------\n");

        System.out.println("App Context: ");
        createObjWithAppContextInSpring();
        System.out.println("----------\n");

        System.out.println("Abstract App Context: ");
        createObjWithAbstractAppContextInSpring();
        System.out.println("----------\n");

        System.out.println("Configurable App Context: ");
        createObjWithConfigurableAppContextInSpring();
        System.out.println("----------\n");

    }

    public static void createObjWithBeanFactoryInSpring(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection = (DBConnection) beanFactory.getBean("dbConnection");

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }

    public static void createObjWithAbstractAppContextInSpring(){
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection = abstractApplicationContext.getBean("dbConnection", DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();

        abstractApplicationContext.close();
    }

    public static void createObjWithAppContextInSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection = applicationContext.getBean("dbConnection", DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }

    public static void createObjWithConfigurableAppContextInSpring(){  //Most Beautiful
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DBConnection dbConnection = configurableApplicationContext.getBean("dbConnection", DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();

        configurableApplicationContext.close();
    }
}
