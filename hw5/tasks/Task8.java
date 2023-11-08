package hw5.tasks;

import java.util.stream.Stream;
import java.util.Comparator;


public class Task8 {

    public static void solve(Stream<String> lines) {
        System.out.println("Task 8 solution: ");
        System.out.println(
            lines.map(word -> word.split(":")[0])
                 .max(Comparator.comparingInt(word -> word.length())).get()
        );
    }
}
