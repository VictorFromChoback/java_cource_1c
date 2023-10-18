package hw3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class Task4 {

    public static void solve(File file) {
        ArrayList<String> lines = Reader.readLines(file);
        Collections.reverse(lines);
        for (String line: lines) {
            System.out.println(line);
        }
    }    
}
