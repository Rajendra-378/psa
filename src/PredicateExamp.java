import java.util.function.Predicate;

public class PredicateExamp {
    public static void main(String[] args) {
        Predicate<Integer>val=x->x>3;
        boolean test = val.test(12);
        System.out.println(test); // Output: true
    }
}
