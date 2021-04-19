package sun.study.note.src.testcircle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * CircleDemoTest:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class CircleDemoTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-circle.xml"});
        System.out.println(context.getBean("b"));
        System.out.println(context.getBean("a"));
    }
}
