package hw5.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Task5 {

    public static void solve(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            System.out.println("Task 5 solution: ");
            lines.map(word -> word.split(":")[0])
                 .filter(word -> (word.charAt(0) >= 'a') && word.charAt(0) <= 'h')  
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
