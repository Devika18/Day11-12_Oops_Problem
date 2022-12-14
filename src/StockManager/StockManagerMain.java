package StockManager;

import java.util.Scanner;

public class StockManagerMain {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        Stock[] stockArray = new Stock[3];
        int arrayIndex = 0;
        Stock stockObject = new Stock();
        StockOperations operationObject = new StockOperations();

        do {
            System.out.println("1 : Add Stock\n2 : Value Of each inventory\n3 : Total Value Of Stock\n4 : Exit");
            int userChoice = scannerObject.nextInt();
            switch(userChoice) {
                case 1:
                    stockObject = operationObject.addStock();
                    stockArray[arrayIndex] = stockObject;
                    arrayIndex++;
                    break;

                case 2:

                    operationObject.calculateEachStockValue(stockArray);
                    break;

                case 3:
                    operationObject.calculateTotalValue(stockArray);
                    break;
                case 4:
                    operationObject.exit();
                    break;
            }

            System.out.println("If you want to perform more Operations Enter true");

        }while(scannerObject.nextBoolean());

        scannerObject.close();
    }
}
