import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by pranikchainani on 8/5/16.
 */
public class FibonacciRecursive {
    public static Map<Integer, Integer> cache = new HashMap<>();

    public static int memoizationFibValue(Integer term)
    {
        // 13 -> 12 -> 11,10,9,8,7,6,5,4,3,2,1

        // 0,1,2,3,4,5,6

        IntStream.rangeClosed(0,term)
                  .forEach( i -> cache.computeIfAbsent(i, ignore -> cache.get(i-1) + cache.get(i-2)));

        return cache.get(term);
    }
    public static int fibValue(int term)
    {
        if (term <= 1)
        {
            return 1;
        }
        return fibValue(term - 2) + fibValue(term - 1);
    }
    public static void main(String[] args) {
        cache.put(0,1);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);

        long start = System.nanoTime();
        System.out.println(fibValue(30) + "->" + "Recursion");
        System.out.println(System.nanoTime() - start);
        start = System.nanoTime();
        System.out.println(memoizationFibValue(30) + "->" + "Memoization");
        System.out.println(System.nanoTime() - start);
    }
}
