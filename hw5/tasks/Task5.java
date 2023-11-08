package hw5.tasks;

import java.util.stream.Stream;


public class Task5 {

    public static void solve(Stream<String> lines) {
        System.out.println("Task 5 solution: ");
        lines.map(word -> word.split(":")[0])
                .filter(word -> (word.charAt(0) >= 'a') && word.charAt(0) <= 'h')  
                .forEach(System.out::println);
    }
}
