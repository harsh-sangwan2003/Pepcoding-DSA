import java.util.HashMap;
import java.util.Set;

public class syntax {

    public static void main(String[] args) {

        // initialise
        HashMap<String, Integer> map = new HashMap<>();

        // put
        map.put("India", 628);
        map.put("China", 837);
        map.put("Dubai", 120);

        System.out.println(map);

        // get
        int getData = map.get("India");
        System.out.println(getData);

        boolean isChinapr = map.containsKey("China");
        boolean isCanadapr = map.containsKey("Canada");

        System.out.println(isChinapr);
        System.out.println(isCanadapr);

        // keySet
        Set<String> set = map.keySet();

        for (String key : set) {

            int val = map.get(key);
            System.out.println("Key: " + key + " -> Value: " + val);
        }
    }
}
