import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        Locale localeAz = new Locale("az", "AZ");
        Locale localeUK = new Locale("en", "UK");

//        ConfigurableApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");

        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        String msg = applicationContext.getMessage("error.login.message", null, localeUK);
        System.out.println(msg);

        applicationContext.close();
    }
}
