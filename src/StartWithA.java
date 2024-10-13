import java.util.function.Predicate;

public class StartWithA {
    public static void main(String[] args) {
        Predicate<String>val=n->n.startsWith("A");
        boolean result = val.test("Ashoked");
        System.out.println(result);

    }
}
