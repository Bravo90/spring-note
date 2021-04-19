package sun.study.note.src.factroy;

import sun.study.note.src.pojo.xml.User;

/**
 * UserFactory:
 *
 * @author: sunzhen
 * Date: 2021-04-14
 */
public class UserFactory {

    public User build() {
        User user = new User();
        user.setName("工厂创建的user");
        user.setAge(10);
        return new User();
    }
}
