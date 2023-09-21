package hw2;

import java.io.File;

import hw2.classes.solutions.IfSolution;


class Main {

    public static void main(String[] args) {
        File inputFile = new File("hw2/data/file.txt");
        // Can use file or System.in
        TradeReader reader = new TradeReader(inputFile);
        reader.scan();
        IfSolution solution = new IfSolution(reader.carType, reader.price);
        Trade trade = solution.solve();
        trade.log();
        reader.close();
    }
}
