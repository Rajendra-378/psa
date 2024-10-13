import java.util.function.Function;

public class FunAdd {
    public static void main(String[] args) {
        Function<Integer,String>val=n->"val:"+n;
        String result = val.apply(10);
        System.out.println(result);
    }
}
