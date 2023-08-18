package MasaiAssigments;

import java.util.HashMap;

public class Hashmap {
    
    

    public static void main(String[] args) {
        String[] classNames = {"Class-V", "Class-VI", "Class-VII", "Class- VIII"};
      
        Integer[] values = {1, 2, 3, 4};

        HashMap<String, Integer> hashMap = createHashMap(classNames, values);
        System.out.println(hashMap);
    }

    public static HashMap<String, Integer> createHashMap(String[] classNames, Integer[] values) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < classNames.length; i++) {
            hashMap.put(classNames[i], values[i]);
        }
        return hashMap;
    }
}

