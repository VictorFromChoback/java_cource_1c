package hw5;

import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import hw5.tasks.Task1;
import hw5.tasks.Task2;
import hw5.tasks.Task3;
import hw5.tasks.Task4;
import hw5.tasks.Task5;
import hw5.tasks.Task6;
import hw5.tasks.Task7;
import hw5.tasks.Task8;


public class Main {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task1.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task2.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task3.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task4.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task5.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task6.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task7.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Task8.solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
