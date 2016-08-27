import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pranikchainani on 8/16/16.
 */
public class ArrayStreams {
//    public static void main(String[] args) {
//        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        arrayList.stream().filter(ArrayStreams::function).forEach(ArrayStreams::println);
//    }
//    public static boolean function(Integer a)
//    {
//        return a % 2 == 0;
//    }
//    public static void println(Integer a)
//    {
//        System.out.println(a);
//    }

    public static void main(String[] args) {
        File directory = new File("/Users/pranikchainani/Desktop");

        File[] files = directory.listFiles();

//        for (File file: files) {
//            if(!file.isDirectory())
//                System.out.println(file.getName());
//        }

        //file::isDirectory

        Stream.of(files)
                .filter(File::isFile)
                .map(File::getName) // Stream of files is mapped to a stream of string
                .map(String::toUpperCase)
                .filter(e-> e.length() >10)
                .forEach(System.out::println);
    }
}
