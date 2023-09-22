package hw2;

import java.io.File;

import hw2.classes.solutions.EnumSolution;
import hw2.classes.solutions.IfSolution;


class Main {

    public static void main(String[] args) {
        File inputFile = new File("hw2/data/file.txt");
        // Can use file or System.in
        TradeReader reader = new TradeReader(inputFile);
        reader.scan();
        reader.close();

        IfSolution ifSolution = new IfSolution(reader.carType, reader.price);
        Trade ifTrade = ifSolution.solve();
        ifTrade.log();

        EnumSolution enumSolution = new EnumSolution(reader.carType, reader.price);
        Trade enumTrade = enumSolution.solve();
        enumTrade.log();

        assert ifTrade == enumTrade;
    }
}
