package hw3;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


public class Task3 {
    
    public static Map<String, Integer> solve(ArrayList<String> words) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word: words) {
            map.merge(word, 1, (prev, one) -> prev + one);
        }
        return map;
    }
}
