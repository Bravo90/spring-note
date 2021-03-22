package sun.study.note.src.pojo.anno;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * StudentService
 *
 * @author sunzhen
 */
@ToString
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;
}
