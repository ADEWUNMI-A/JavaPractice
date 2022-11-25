package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

class CheckoutTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<Double> priceList = new ArrayList<>();
        while (true) {
            System.out.println("Enter the item: ");
            String item = sc.nextLine();
            itemList.add(item);

            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();
            quantityList.add(quantity);

            System.out.println("Enter the price: ");
            double price = sc.nextDouble();
            priceList.add(price);
            sc.nextLine();

            System.out.println("More item?");
            String moreItem = sc.nextLine().toUpperCase();
            if(!moreItem.equals("YES")){
                Checkout.displayReceipt(itemList,quantityList,priceList);
                break;
            }
        }
    }
}