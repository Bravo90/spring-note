package sun.study.note.src.xmlctx;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.study.note.src.pojo.Demo;
import sun.study.note.src.pojo.xml.User;
import sun.study.note.src.pojo.xml.UserMapper;
import sun.study.note.src.pojo.xml.UserService;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * AppTest
 *
 * @author sunzhen
 */
public class XmlAppCtxTest {

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

        Demo demo = new Demo();
        demo.setName("demo");
        demo.setNum(123);

        context.getBeanFactory().registerSingleton("demo",demo);

        Demo user1 = context.getBean("demo", Demo.class);
        System.out.println(user1);
    }

    @Test
    public void test4() {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        // 初始化属性
        builder.addPropertyValue("name", "sunzhen")
                .addPropertyValue("age", 30);
        /**
         *  beanDefinition.getPropertyValues()
         *                .add("name","sunzhen")
         *                .add("age",13);
         */

        // 获取BeanDefinition对象
        BeanDefinition beanDefinition = builder.getBeanDefinition();
        // 创建BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 向BeanFactory中注册BeanDefinitionF
        beanFactory.registerBeanDefinition("user", beanDefinition);
        // 获取对象
        User user = beanFactory.getBean(User.class);
        System.out.println(user);
        System.out.println(beanFactory.getBean("user"));
    }

    @Test
    public void test5() {

        BeanDefinition mapperBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(UserMapper.class)
                .getBeanDefinition();

        BeanDefinition serviceBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(UserService.class)
                .addPropertyReference("userMapper", "userMapper")
                .getBeanDefinition();

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("userMapper", mapperBeanDefinition);
        beanFactory.registerBeanDefinition("userService", serviceBeanDefinition);

        System.out.println(beanFactory.getBean("userMapper"));
        System.out.println(beanFactory.getBean("userService"));

    }

    @Test
    public void test6() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        int count = xmlBeanDefinitionReader.loadBeanDefinitions("classpath:spring-demo1.xml");
        System.out.println(count);
        System.out.println(beanFactory.getBean("user"));

        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test7() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation("spring-demo1.xml");
        context.refresh();
        String[] beanNamesForType = context.getBeanFactory().getBeanNamesForType(BeanFactoryPostProcessor.class, true, false);
        System.out.println(new ArrayList<>(Arrays.asList(beanNamesForType)));
    }

}
