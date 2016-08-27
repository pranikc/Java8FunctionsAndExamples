import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by pranikchainani on 8/19/16.
 */
public class rangeClosedBoxed {
    // 10 - 1,2,5,10
    public static List<Integer> factors(int number)
    {
//        List<Integer> factors = new ArrayList<>();
//        for (int i = 1; i <= number; i++)
//        {
//            if (number % i == 0)
//            {
//                factors.add(i);
//            }
//        }
        return IntStream.rangeClosed(1, number)
                        .filter(i -> number % i == 0)
                        .boxed()
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(factors(10));
    }
}
