import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by pranikchainani on 8/20/16.
 */
public class primeNumbers {
    public static List<Integer> listOfPrimes(int maxNumber) {
//        for (int i = 2; i <= maxNumber; i++)
//        {
//            if (isPrime(i))
//            {
//                primes.add(i);
//            }
//        }
        return IntStream.rangeClosed(2, maxNumber)
                        .boxed()
                        .filter(number -> isPrime(number))
                        .collect(Collectors.toList());
    }

    public static boolean isPrime(int number)
    {
        return IntStream.rangeClosed(2, (int) Math.floor(Math.sqrt(number)))
                        .noneMatch(element -> number % element == 0);

        // we also have functions like allMatch and anyMatch

        // First we select a range of numbers between 2 and sqrt(number)
        // We acheck if the number is divisible by the range taken
    }

    public static void main(String[] args) {
        System.out.println(listOfPrimes(50));
    }
}