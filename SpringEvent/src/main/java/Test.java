import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import component.publisher.UserSendMailPublisher;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserSendMailPublisher userSendMailPublisher =
                appContext.getBean("userSendMailPublisher", UserSendMailPublisher.class);
        userSendMailPublisher.userRegisterMessage();
    }
}
