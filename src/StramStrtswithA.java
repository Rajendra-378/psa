import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramStrtswithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lipu","Dipu","ashok","sipu");
        List<String> a = list.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
        System.out.println(a);
    }
}
