package sun.study.note.src.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * DestoryBeanPostProcessor:
 *
 * @author: sunzhen
 * Date: 2021-04-16
 */
public class DestoryBeanPostProcessor implements DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
