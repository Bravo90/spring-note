package sun.study.note.src.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * MyBeanPostProcessor:
 *
 * @author: sunzhen
 * Date: 2021-04-02
 */
public class MyBeanPostProcessor implements BeanPostProcessor , PriorityOrdered {

    public MyBeanPostProcessor(){
        System.out.println("MyBeanPostProcessor创建");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor --- Before");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor --- after");
        return null;
    }



    @Override
    public int getOrder() {
        return 0;
    }
}
