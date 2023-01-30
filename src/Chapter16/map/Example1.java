package Chapter16.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Amirah", 50);
        map.put("Balablu", 40);
        map.put("Shepherd", 125);

        //overrides the value of Shepherd
        map.put("Shepherd", 40);

        System.out.println(map);

        Integer amirahAge = map.get("Amirah");

        System.out.println("Amirah's age -> "+ amirahAge + "years");

        System.out.println(map.containsValue(amirahAge));
        System.out.println(map.containsKey("Atiku"));

        System.out.println(map.getOrDefault("Amirah", 12));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        int result = map.replace("Amirah", 80);
        System.out.println(result);
        System.out.println(map);
        System.out.println(map.size());
    }
}
