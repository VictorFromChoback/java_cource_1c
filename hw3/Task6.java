package hw3;

import java.io.File;
import java.util.ArrayList;


public class Task6 {
    public static void solve(File file, ArrayList<Integer> indexes) {
        ArrayList<String> lines = Reader.readLines(file);
        for (int idx: indexes) {
            System.out.println(lines.get(idx));
        }
    }
}
