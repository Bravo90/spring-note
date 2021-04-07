package sun.study.note.src.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * MySubBeanFactoryPostProcessor:
 *
 * @author: sunzhen
 * Date: 2021-04-07
 */
public class MySubBeanFactoryPostProcessor extends MyBeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        super.postProcessBeanFactory(beanFactory);
    }
}
