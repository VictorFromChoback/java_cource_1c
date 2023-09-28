package hw3;

import java.util.HashMap;
import java.util.ArrayList;


public class Task3 {
    
    public static HashMap<String, Integer> solve(ArrayList<String> words) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word: words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }
}
