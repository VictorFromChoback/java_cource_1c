package hw3;

import java.util.ArrayList;
import java.util.HashSet;


public class Task1 {
    public static int solve(ArrayList<String> words) {
        HashSet<String> wordsSet = new HashSet<String>(words);
        return wordsSet.size();
    }
}
