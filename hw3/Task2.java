package hw3;

import java.util.ArrayList;
import java.util.TreeSet;


public class Task2 {
    public static ArrayList<String> solve(ArrayList<String> words) {
        TreeSet<String> set = new TreeSet<String>(new SizeComparator());
        for (String word: words) {
            set.add(word);
        }
        return new ArrayList<String>(set);
    }
}
