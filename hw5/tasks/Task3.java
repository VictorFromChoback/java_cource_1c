package hw5.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.Math;


public class Task3 {

    public static void solve(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            System.out.println("Task 3 solution: ");
            System.out.println(
                lines.map(word -> word.split(":")[0])
                     .collect(Collectors.groupingBy(word -> word.substring(0, Math.min(word.length() - 1, 3))))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
