package hw2;

import java.io.File;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import hw2.classes.CarType;


public class TradeReader {
    
    public CarType carType;
    public int price;
    Scanner scanner;

    public TradeReader(InputStream stream) {
        scanner = new Scanner(stream);
    }

    public TradeReader(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException err) {
            err.printStackTrace();
        }
    }

    public final void scan() {
        scanner.nextLine();
        carType = CarType.valueOf(scanner.nextLine().split("=")[1]);
        price = Integer.parseInt(scanner.nextLine().split("=")[1]);
    }

    public final void close() {
        scanner.close();
    }

}
