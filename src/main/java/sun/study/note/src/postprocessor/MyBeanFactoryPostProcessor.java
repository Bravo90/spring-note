package sun.study.note.src.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * MyBeanFactoryPostProcessor
 *
 * @author sunzhen
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    public MyBeanFactoryPostProcessor() {
        System.out.println("MyBeanFactoryPostProcessor 创建");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("-->>>>>>>>>>postProcessBeanFactory");
        BeanDefinition user = beanFactory.getBeanDefinition("user");
        user.setInitMethodName("init_method");

        Object user1 = beanFactory.getBean("user");
        System.out.println(user1);

    }
}
