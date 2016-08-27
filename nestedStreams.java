import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by pranikchainani on 8/19/16.
 */
public class nestedStreams {
    public static List<Integer> factors(int number)
    {
        return IntStream.rangeClosed(1, number)
                .filter(i -> number % i == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    // /Create a function Factors(list)
    // this will call factors(int) at each step

    public static Set<Integer> factors(List<Integer> numbers)
    {


//      Imperetive Style
//        for(Integer number: numbers){
//            allFactors.addAll(factors(number));
//        }
//
//        return allFactors;

        // FunctionalStyle
//        return numbers.stream() // Stream<Intger>
//                        .map( e -> factors(e))
//                        .reduce(new HashSet<>(),
//                                 (factorSet,factorsForANumber) -> {
//                                     factorSet.addAll(factorsForANumber);
//                                     return factorSet;
//                                 },  // Stream<set> { donald. trump, hillary, clinton)
//                                 (set1, set2) -> {set1.addAll(set2);
//                                     return set1;}); // Set

        // Reduce explanations
        // (set1, set2) -> Set1. addAll(set2); return outputSet
        // (outputSet, set3) -> outputSet.addAll(set3); return outputSet
        // (outputSet, set4) -> outputSet.addAll(set4); return outputSet;

        return numbers.stream()
                      .flatMap( e -> factors(e).stream())
                      .collect(Collectors.toSet());

    }

    public static void main(String[] args) {
        // Create a List here and call overloaded function factors(List)
        List<Integer> numbers = Arrays.asList(1,4,6,10);


        System.out.println(factors(numbers));
    }
}
