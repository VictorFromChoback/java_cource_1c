package hw5.tasks;

import java.util.stream.Stream;


public class Task6 {

    public static void solve(Stream<String> lines) {
        System.out.println("Task 6 solution: ");
        lines.map(word -> word.split(":")[0])
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .forEach(System.out::println);
    }
}
