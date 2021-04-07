package sun.study.note.src.pojo.xml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User
 *
 * @author sunzhen
 */
@ToString

public class User {
    private String name;
    private int age;

    public User() {
        System.out.println("调用User的构造方法");
    }

    public void setName(String name) {
        System.out.println("user#setName(String)");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        System.out.println("user#setAge(int)");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void initMethod() {
        System.out.println("initMethod");
        System.out.println(this);
        name = "亚历山大";
        age = 1234;

    }

    public void init_method(){
        System.out.println("user_init");
        System.out.println(this);
        name = "凯撒大帝";
        age = 3456;

    }
}
