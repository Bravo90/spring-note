package sun.study.note.src.pojo.xml;

import lombok.ToString;

/**
 * User
 *
 * @author sunzhen
 */
@ToString

public class AnotherUser {
    private String name;
    private int age;

    public AnotherUser() {
        System.out.println("AnotherUser");
    }

    public void setName(String name) {
        System.out.println("AnotherUser name赋值操作");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        System.out.println("AnotherUser age赋值操作");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void initMethod() {
        System.out.println("AnotherUser initMethod");
        System.out.println(this);
        name = "AnotherUser";
        age = 111;

    }

    public void init_method() {
        System.out.println("AnotherUser init_method");
        System.out.println(this);
        name = "AnotherUser";
        age = 111;

    }
}
