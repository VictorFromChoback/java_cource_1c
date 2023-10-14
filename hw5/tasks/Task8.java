package hw5.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Task8 {

    public static void solve(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            System.out.println("Task 8 solution: ");
            System.out.println(
                lines.map(word -> word.split(":")[0])
                 .max(new SizeComparator()).get()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}