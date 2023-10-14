package hw5.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.HashSet;


public class Task4 {

    public static void solve(String filename) {
        HashSet<Character> vowel = new HashSet<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('o');
        vowel.add('i');
        vowel.add('u');
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            System.out.println("Task 4 solution: ");
            System.out.println(
                lines.map(word -> word.split(":")[0])
                     .flatMapToInt(CharSequence::chars)
                     .mapToObj(ch -> (char) ch)
                     .filter(ch -> vowel.contains(ch))
                     .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))   
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
