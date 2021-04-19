package sun.study.note.src.extend;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * LessionTest:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class LessonTest {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation("spring-extend.xml");
        context.refresh();
        System.out.println(context.getBean("lesson"));
        context.close();
    }

    @Test
    public void test2(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(factory);

        Collection<BeanPostProcessor> values = factory.getBeansOfType(BeanPostProcessor.class).values();
        for (BeanPostProcessor postProcessor:values){
            System.out.println(postProcessor);
        }
    }

}
