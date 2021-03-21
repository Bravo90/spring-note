package sun.study.note.demo1;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.study.note.demo1.pojo.User;

/**
 * AppTest
 *
 * @author sunzhen
 */
public class AppTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-demo1.xml"});
        User user = (User) context.getBean("user");
        System.out.println(user);
        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
    }

    @Test
    public void test2() {
        // 说明：此种方式未调用refresh，增强什么的不可用呀！
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions("spring-demo1.xml");

        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation("spring-demo1.xml");
        context.refresh();
        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
    }
}
