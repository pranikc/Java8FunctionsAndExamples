import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by pranikchainani on 8/26/16.
 */
public class parallelAndForEachOrdered {

    public static void makeThreadBusy(){
        double i = 0;
        while ( i < 1000000000L){
            double j = i*i;
            i++;
        }
    }

    public static void forEachLoop(Stream numbers){
        numbers.forEach(e -> makeThreadBusy());
    }

    public static void forEachOrdered( Stream numbers){
        System.out.println("------------------");
        numbers.forEachOrdered(e -> makeThreadBusy());
    }

    public static void main(String[] args) {
        List< Integer> numbers1 = Arrays.asList(1,10,2,1,3,7);

        Set<Integer> numbers2 = new HashSet<Integer>(Arrays.asList(1,10,2,1,3,7));

        long start = System.currentTimeMillis();
        forEachLoop(numbers1.stream());
        System.out.println("Time taken for normal loop : "+ (System.currentTimeMillis() - start));
//        forEachOrdered(numbers1.stream());

//        forEachLoop(numbers2.stream());
//        forEachOrdered(numbers2.stream());

        start = System.currentTimeMillis();
        forEachOrdered(numbers1.parallelStream());
        System.out.println("Time Taken for parallel loop :"+ (System.currentTimeMillis() - start));
//        forEachOrdered(numbers1.parallelStream());
    }
}
