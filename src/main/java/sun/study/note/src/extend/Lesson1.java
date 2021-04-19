package sun.study.note.src.extend;

import lombok.*;
import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;
import java.lang.reflect.Constructor;

/**
 * Lesson1:
 *
 * @author: sunzhen
 * Date: 2021-04-15
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Lesson1 implements DisposableBean {
    //课程名称
    private String name;
    //课时
    private int lessonCount;
    //描述信息
    private String description;

    @PreDestroy
    public void preDestroy(){
        System.out.println("lesson1 preDestroy()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("lesson1 destroy()");
    }
}
