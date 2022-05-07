package beanFactory;

import model.DBConnection;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("Bean count: " + beanFactory.getBeanDefinitionCount());
        DBConnection dbConnection = beanFactory.getBean("dbConnection", DBConnection.class);
    }
}
