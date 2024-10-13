import java.util.function.Predicate;

public class CharGreaterthaan4 {
    public static void main(String[] args) {
        Predicate<String> val=x->x.length()>=4;
        boolean result = val.test("rama");
        System.out.println(result);

    }
}
