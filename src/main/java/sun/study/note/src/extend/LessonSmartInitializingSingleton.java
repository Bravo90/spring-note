package sun.study.note.src.extend;

import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * LessonSmartInitializingSingleton:
 *
 * @author: sunzhen
 * Date: 2021-04-16
 */
public class LessonSmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("afterSingletonsInstantiated");
    }
}
