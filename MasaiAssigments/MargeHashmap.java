package MasaiAssigments;

import java.util.HashMap;

import java.util.Map;


public class MargeHashmap {
    
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>(); // containing the first set of key-value pairs.
        map1.put("a", 100);
        map1.put("b", 200);
        map1.put("c", 300);
        
        HashMap<String, Integer> map2 = new HashMap<>(); // containing the second set of key-value pairs.
        map2.put("a", 300);
        map2.put("b", 200);
        map2.put("d", 400);

        HashMap<String, Integer> combinedMap = combineMaps(map1, map2);

        System.out.println(combinedMap);
    }

    public static HashMap<String, Integer> combineMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> combinedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            combinedMap.put(entry.getKey(), entry.getValue() + map2.getOrDefault(entry.getKey(), 0));
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (!combinedMap.containsKey(entry.getKey())) {
                combinedMap.put(entry.getKey(), entry.getValue());
            }
        }

        return combinedMap;
    }
}


