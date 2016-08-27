import java.util.HashMap;
import java.util.Map;

/**
 * Created by pranikchainani on 8/6/16.
 */
public class HashMapKeyAndValue {

    public static void printKeys(String keys, Integer value){
        System.out.println(keys +" -> "+value);
    }


    public static void main(String[] args) {
        Map<String, Integer> nameAndAge = new HashMap<>();

        nameAndAge.put("Karthikk",24);
        nameAndAge.put("Chandan",35);
        nameAndAge.put("Pranick",14);
        nameAndAge.put("Gaarthick",24);

//        Set<String> keySet = nameAndAge.keySet();
//        System.out.println(keySet);

//        for (String key:keySet){
//            System.out.println(key + "->" +nameAndAge.get(key));
//        }

//        Collection<Integer> valuesSet = nameAndAge.values();
//        System.out.println(valuesSet);


        // Lambda Programming
//        nameAndAge.keySet()
//                  .forEach(key -> printKeys(key, nameAndAge.get(key)));
//
//        nameAndAge.forEach( (key, value) -> printKeys(key,value));

        nameAndAge.forEach(HashMapKeyAndValue::printKeys);
    }
}
