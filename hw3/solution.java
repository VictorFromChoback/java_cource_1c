package hw3;

import java.io.File;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        ArrayList<String> words = Reader.read(inputFile);        
        int n = Integer.parseInt(args[1]);
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            indexes.add(Integer.parseInt(args[2 + i]));
        }

        System.out.format("Task 1, amount unique words - %s\n", Task1.solve(words));

        System.out.print("Task 2, sorted unique words - ");
        System.out.println(Task2.solve(words));

        System.out.print("Task 3, words count - ");
        System.out.println(Task3.solve(words));

        System.out.println("Task 4, reversed lines - ");
        Task4.solve(inputFile);
    
        System.out.println("Task 5, reversed iterator - ");
        Task5.solve(words);

        System.out.println("Task 6, random access lines - ");
        Task6.solve(inputFile, indexes);
    }
}
