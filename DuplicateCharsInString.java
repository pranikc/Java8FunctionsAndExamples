import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInString {
    public static void checkIfValueGreaterThan2(Character key, Integer value)
    {
        if (value > 1)
            System.out.println(key+"--->"+value);
    }

    public static void findDuplicateChars(String str){
        Map<Character, Integer> dupMap = new HashMap<>();
        str.chars()
            .mapToObj(i -> (char)i)
            .forEach(c -> dupMap.merge(c,1, (oldValue,newValue) -> oldValue + newValue));

        dupMap.forEach(DuplicateCharsInString::checkIfValueGreaterThan2);
    }
    public static void main(String a[]){
        findDuplicateChars("JJava2Noviceaa");
    }
}