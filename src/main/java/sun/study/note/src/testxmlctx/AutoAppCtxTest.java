package sun.study.note.src.testxmlctx;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.study.note.src.pojo.xml.User;

/**
 * AutoAppCtx:
 *
 * @author: sunzhen
 * Date: 2021-04-14
 */
public class AutoAppCtxTest {
    @Autowired
    private User user;

    @Test
    public void test1(){
        System.out.println(user);
    }
}
