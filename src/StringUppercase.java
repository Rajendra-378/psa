import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ashok","rajib","sudhnsu","raja");
        List<String> result = list.stream().map(n ->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);

    }
}


