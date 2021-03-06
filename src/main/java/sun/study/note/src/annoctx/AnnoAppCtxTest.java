package sun.study.note.src.annoctx;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.study.note.src.pojo.anno.StudentMapper;
import sun.study.note.src.pojo.anno.StudentService;

import java.util.Map;

/**
 * AppTest
 *
 * @author sunzhen
 */
public class AnnoAppCtxTest {

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentService.class,StudentMapper.class);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        System.out.println(studentService);

    }

        @Test
    public void test1(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        AnnotatedBeanDefinitionReader definitionReader = new AnnotatedBeanDefinitionReader(beanFactory);

        definitionReader.register(StudentService.class, StudentMapper.class);

        Map<String, BeanPostProcessor> postProcessorMap
                = beanFactory.getBeansOfType(BeanPostProcessor.class);

        for (String key:postProcessorMap.keySet()){
            System.out.println(postProcessorMap.get(key));
            beanFactory.addBeanPostProcessor(postProcessorMap.get(key));
        }

        System.out.println(beanFactory.getBean("studentMapper"));
        System.out.println(beanFactory.getBean("studentService"));
    }
}
