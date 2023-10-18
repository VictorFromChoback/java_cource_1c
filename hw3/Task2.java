package hw3;

import java.util.ArrayList;


public class Task2 {
    public static ArrayList<String> solve(ArrayList<String> words) {
        ArrayList<String> words_copy = new ArrayList<String>(words);
        words_copy.sort(new SizeComparator());
        return words_copy;
    }
}
