package sun.study.note.src.circle;

/**
 * B:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class B {

    private A a;

    public B() {
        System.out.println("B实例化");
    }

    public B(A a) {
        this.a = a;
    }

    public void setA(A a) {
        System.out.println("对象b中属性a赋值");
        this.a = a;
    }

    public A getA() {
        return a;
    }
}
