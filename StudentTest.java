
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void setVarsta() {
        Student s = new Student("ana maria ionescu",20,8.75);
        s.setVarsta(19);
        assertEquals(19,s.getVarsta());
    }
}
