package Chapter7;

import java.util.ArrayList;

public class Checkout {

    public static double totalPerItem(ArrayList<Double> priceList, ArrayList<Integer> quantityList) {
        double total = 0;
        for(int index = 0; index < priceList.size(); index++) {
            total += priceList.get(index) * quantityList.get(index);
        }
        return total;
    }

    public static void displayReceipt(ArrayList<String> itemList, ArrayList<Integer> quantityList,
                                      ArrayList<Double> priceList) {
        System.out.printf("%n%10s%20s%20s%20s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL");
        for(int index = 0; index < itemList.size(); index++) {
            System.out.printf("%10s%20d%20.2f%20.2f%n", itemList.get(index), quantityList.get(index),
                    priceList.get(index), priceList.get(index) * quantityList.get(index));
            if(index == itemList.size() - 1) {
                System.out.printf("%50s%20.2f", "GRAND TOTAL", totalPerItem(priceList, quantityList));

            }
        }
    }
}
