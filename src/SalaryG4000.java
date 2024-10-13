import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryG4000 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2300, 2345, 7543, 6753, 1265, 6400);
        List<Integer> result = list.stream().filter(x -> x >= 4000).collect(Collectors.toList());
        System.out.println(result);
    }
}
