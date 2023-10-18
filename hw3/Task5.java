package hw3;

import java.util.ArrayList;


public class Task5 {
    public static void solve(ArrayList<String> array) {
        ReverseIterator<String> iter = new ReverseIterator<String>(array);
        while (iter.hasNext()) {
            System.out.format("%s ", iter.next());
        }
        System.out.println();
    }
}
