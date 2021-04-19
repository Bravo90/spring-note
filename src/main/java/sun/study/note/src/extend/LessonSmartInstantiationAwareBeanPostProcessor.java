package sun.study.note.src.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * LessonSmartInstantiationAwareBeanPostProcessor:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class LessonSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {

        if (beanName.equals("lesson")) {
            Constructor<?>[] constructors = beanClass.getConstructors();
            return new Constructor[]{constructors[1]};
        } else {
            return null;
        }
    }
}
