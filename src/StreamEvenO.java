import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenO {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 32, 41, 43, 13, 56, 86, 755);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
