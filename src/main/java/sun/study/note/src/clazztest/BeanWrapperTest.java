package sun.study.note.src.clazztest;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * BeanWapperTest:
 *
 * @author: sunzhen
 * Date: 2021-04-14
 */
public class BeanWrapperTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> clazz = Class.forName("sun.study.note.src.pojo.xml.User");
        Object obj = clazz.newInstance();

        BeanWrapper beanWrapper = new BeanWrapperImpl(obj);

        beanWrapper.setPropertyValue("name","sunzhen");
        beanWrapper.setPropertyValue("age",30);
        System.out.println(obj);
        System.out.println(beanWrapper.getWrappedInstance());
    }
}
