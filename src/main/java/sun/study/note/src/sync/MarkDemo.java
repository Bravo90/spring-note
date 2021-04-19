package sun.study.note.src.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * MarkDemo:
 *
 * @author: sunzhen
 * Date: 2021-04-18
 */
public class MarkDemo {
    public synchronized void method1() {
        System.out.println(ClassLayout.parseInstance(this).toPrintable());
    }
}
