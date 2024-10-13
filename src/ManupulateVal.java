import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManupulateVal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34, 56, 42,453);
        List<Integer> result = list.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(result);

    }
}
