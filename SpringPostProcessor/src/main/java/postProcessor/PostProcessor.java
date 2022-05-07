package postProcessor;

import model.DBConnection;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DBConnection){
            System.out.println("bean type is DBConnection.class");
        }
        System.out.println("Connection after creation: " + beanName + ": " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Connection before Creation: " + beanName + ": " + bean);

        return bean;
    }
}
