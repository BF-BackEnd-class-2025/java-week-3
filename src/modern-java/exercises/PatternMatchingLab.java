import java.util.List;
import java.util.Map;

public class PatternMatchingLab {
    
    // TODO: Extend this method using instanceof pattern matching.
    // Suggested cases: Double, Map
    static String classify(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof String s) {
            return "String length=" + s.length();
        }
        if (value instanceof Integer i) {
            return "Integer value=" + i;
        }
        if (value instanceof List<?> list) {
            return "List size=" + list.size();
        }
        return "Other";
    }

    public static void main(String[] args) {
        System.out.println(classify("Hello"));
        System.out.println(classify(42));
        System.out.println(classify(List.of("a", "b")));
        System.out.println(classify(Map.of("x", 1)));
        System.out.println(classify(3.14));
    }
}
