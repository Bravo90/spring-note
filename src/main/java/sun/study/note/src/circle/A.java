package sun.study.note.src.circle;

/**
 * A:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
public class A {

    private B b;

    public A() {
        System.out.println("A实例化");
    }

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        System.out.println("对象a中属性b赋值");
        this.b = b;
    }
}
