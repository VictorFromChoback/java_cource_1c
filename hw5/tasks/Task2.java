package hw5.tasks;

import java.util.stream.Stream;


public class Task2 {

    public static void solve(Stream<String> lines) {
        System.out.println("Task 2 solution: ");
        lines.map(word -> word.split(":")[0])
                .filter(word -> word.length() == 7)
                .forEach(System.out::println);
    }
}
