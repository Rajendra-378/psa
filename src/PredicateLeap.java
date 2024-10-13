import java.util.function.Predicate;

public class PredicateLeap {
    public static void main(String[] args) {
        Predicate<Integer>val=n->n%2==0;
        boolean test = val.test(11);
        if(test){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
