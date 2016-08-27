import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by pranikchainani on 8/20/16.
 */
public class PythogoreanTriples {
    public static List<List<Integer>> pythogoreanTriples(int maxNumber) {
        List<List<Integer>> pythogoreanTriple = new ArrayList<>();
        List<Integer> cValues = IntStream.rangeClosed(1, maxNumber)
                                         .boxed()
                                         .collect(Collectors.toList());

//        for (int a = 1; a <= maxNumber; a++)
//        {
//            for (int b = a; b <= maxNumber; b++)
//            {
//                for (int c : cValues)
//                {
//                    if (Math.round(Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
//                    {
//                        pythogoreanTriples.add(Arrays.asList(a,b,c));
//                    }
//                }
//            }
//        }

        IntStream.rangeClosed(1, maxNumber)
                .forEach(a -> IntStream.rangeClosed(a, maxNumber)
                                        .forEach(b -> cValues.stream()
                                                             .filter(c -> a*a + b*b == c*c)
                                                             .forEach(c -> pythogoreanTriple.add(Arrays.asList(a, b, c)))));

        return pythogoreanTriple;
    }

    public static void main(String[] args) {
        System.out.println(pythogoreanTriples(20));
    }
}
