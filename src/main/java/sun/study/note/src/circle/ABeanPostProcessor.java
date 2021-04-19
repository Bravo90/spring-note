package sun.study.note.src.circle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ABeanPostProcessor:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class ABeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor -- before");
        if(beanName.equals("a")){
            return new SubA();
        }

        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor -- after");
        return null;
    }
}
