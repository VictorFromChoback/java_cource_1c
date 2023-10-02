package hw2;

import java.io.File;

import hw2.classes.solutions.EnumSolution;
import hw2.classes.solutions.IfSolution;
import hw2.input.TradeReader;


class Main {

    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        // Can use file or System.in
        TradeReader reader = new TradeReader(inputFile);
        TradeInput tradeInput = reader.getTradeInput();

        IfSolution ifSolution = new IfSolution(tradeInput.carType, tradeInput.price);
        Trade ifTrade = ifSolution.solve();
        ifTrade.log();

        EnumSolution enumSolution = new EnumSolution(reader.carType, reader.price);
        Trade enumTrade = enumSolution.solve();
        enumTrade.log();

        assert ifTrade == enumTrade;
    }
}
