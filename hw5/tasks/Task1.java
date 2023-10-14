package hw5.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Task1 {

    public static void solve(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            System.out.println("Task 1 solution: ");
            System.out.println(lines.filter(word -> word.startsWith("n")).count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
