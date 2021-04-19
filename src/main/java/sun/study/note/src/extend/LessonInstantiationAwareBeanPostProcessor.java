package sun.study.note.src.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.util.Objects;

/**
 * LessonInstantiationAwareBeanPostProcessor:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class LessonInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println(beanName + "  BeanPostProcessor ---实例化--- Before");
        if (beanName.equals("lesson")) {
            Lesson1 lesson = new Lesson1();
            lesson.setName("C从入门到放弃");
            lesson.setLessonCount(120);
            lesson.setDescription("C系列坑爹教程！");
            return null;
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "  BeanPostProcessor ---实例化--- After");
        return false;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "  BeanPostProcessor ---初始化--- Before");
        if (beanName.equals("lesson")) {
            Lesson1 lesson = new Lesson1();
            lesson.setName("C++ 从入门到放弃");
            lesson.setLessonCount(111);
            lesson.setDescription("C++ 系列坑爹教程！");
            return null;
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "  BeanPostProcessor ---初始化--- After");
        return null;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (beanName.equals("lesson")) {
            if (Objects.isNull(pvs)) {
                pvs = new MutablePropertyValues();
            }
            if (pvs instanceof MutablePropertyValues) {
                MutablePropertyValues mpvs = (MutablePropertyValues) pvs;
                mpvs.add("name", "编程入门");
            }
        }
        return null;
    }

}
