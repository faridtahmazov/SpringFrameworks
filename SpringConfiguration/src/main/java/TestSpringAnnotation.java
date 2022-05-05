import bean.DBConnection;
import com.company.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAnnotation {
    public static void main(String[] args) {
        System.out.println("---------- Annotation ----------");

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
        AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection dbConnection = abstractApplicationContext.getBean(DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();

        abstractApplicationContext.close();
    }

    public static void createObjWithAppContextInSpring(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection dbConnection = applicationContext.getBean(DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }

    public static void createObjWithConfigurableAppContextInSpring(){  //Most Beautiful
        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection dbConnection = configurableApplicationContext.getBean(DBConnection.class);

        dbConnection.openConnection();
        dbConnection.closeConnection();

        configurableApplicationContext.close();
    }
}
