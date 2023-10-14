package hw5.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Task7 {

    public static void solve(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            System.out.println("Task 7 solution: ");
            lines.map(word -> word.split(":")[0])
                 .filter(word -> word.charAt(0) == 'a' && word.charAt(word.length() - 1) == 'z')
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
