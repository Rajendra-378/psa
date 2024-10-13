import java.util.function.Predicate;

public class StringMatch {
    public static void main(String[] args) {
        Predicate<String>val=a->a.equals("mike");
        boolean result = val.test("mike");
        System.out.println(result);
    }
}
