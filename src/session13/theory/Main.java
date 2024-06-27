package session13.theory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("math", 3);
        map.put("physics", 2);
        Map<String, Integer> newMap = new HashMap<>();
        newMap.putAll(map);

        System.out.println(map.keySet()); // [physics, math]
//        Set<String> keys = map.keySet(); // lấy tất cả các key cho vào mảng
        Set<String> newKeys = newMap.keySet();
        //  Một cặp key-value được gọi là một Entry
        // lấy các key và value dựa vào key. map.get(key)
//        for (String key : keys) System.out.println("Key: " + key + ": " + map.get(key));
        for (String newKey : newKeys) System.out.println("Key: " + newKey + ": " + newMap.get(newKey));
        
    }
}
