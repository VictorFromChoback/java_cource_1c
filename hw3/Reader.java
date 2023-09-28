package hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Reader {

    public static ArrayList<String> read(File file) {
        ArrayList<String> words = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                for (String word: scanner.nextLine().split(" |,")) {
                    words.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        return words;
    }

    public static ArrayList<String> readLines(File file) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        return lines;
    }
}
