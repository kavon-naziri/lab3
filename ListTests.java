import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class StringChecker1 implements StringChecker {
    public boolean checkString (String s) {
        if (s.length() > 1) {
            return false;
        }
        return true;
    }
}
public class ListTests {
    @Test
    public void filter() {
        List<String> input1 = new ArrayList<String>();
        StringChecker1 input2 = new StringChecker1();
        List<String> result = new ArrayList<String>();

        input1.add("a");
        input1.add("bc");
        input1.add("d");

        result.add("a");
        result.add("d");

        assertEquals(result, ListExamples.filter(input1, input2));
    }
    
    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        List<String> input2 = new ArrayList<String>();
        List<String> input3 = new ArrayList<String>();

        input1.add("a");
        input1.add("b");
        input1.add("c");

        input2.add("d");
        input2.add("e");
        input2.add("f");

        input3.add("a");
        input3.add("b");
        input3.add("c");
        input3.add("d");
        input3.add("e");
        input3.add("f");

        assertEquals(input3, ListExamples.merge(input1, input2));
    }
}
