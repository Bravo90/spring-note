package sun.study.note.src.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Lesson2:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class LessonBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "  LessonBeanPostProcessor --- Before");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "  LessonBeanPostProcessor --- After");
        return null;
    }


}
