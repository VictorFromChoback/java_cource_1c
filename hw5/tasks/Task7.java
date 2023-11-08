package hw5.tasks;

import java.util.stream.Stream;


public class Task7 {

    public static void solve(Stream<String> lines) {
        System.out.println("Task 7 solution: ");
        lines.map(word -> word.split(":")[0])
                .filter(word -> word.charAt(0) == 'a' && word.charAt(word.length() - 1) == 'z')
                .forEach(System.out::println);
    }
}
