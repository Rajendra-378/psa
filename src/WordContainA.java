import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordContainA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lipu", "ashok", "dipu", "Dash");
        List<String> a = list.stream().filter(x -> x.contains("a")).collect(Collectors.toList());
        System.out.println(a);


    }
}
