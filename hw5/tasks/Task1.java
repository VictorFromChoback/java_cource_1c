package hw5.tasks;

import java.util.stream.Stream;


public class Task1 {

    public static void solve(Stream<String> lines) {
        System.out.println("Task 1 solution: ");
        System.out.println(lines.filter(word -> word.startsWith("n")).count());
    }
}
