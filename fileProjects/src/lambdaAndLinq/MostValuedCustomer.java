package lambdaAndLinq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MostValuedCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, Double> shop = new HashMap<>();
        HashMap<String, String> customerProduct = new HashMap<>();



        while(!"Shop is open".equals(input)){

            String[] tokens= input.split(" ");
            String productName = tokens[0];
            double productPrice = Double.parseDouble(tokens[1]);

            shop.put(productName, productPrice);
            input =sc.nextLine();
        }
        String[] customerTokens = input.split(":");
         while(!"Print".equals(customerTokens[0])){
            if("Discount".equals(customerTokens[0])){
                shop.keySet().stream()
                        .sorted((a, b) -> Double.compare(shop.get(b), shop.get(a)))
                        .limit(3)
                        .forEach(p -> {
                            shop.put(p, shop.get(p) * 0.9);
                        });
            }

             String[] boughtProducts = customerTokens[1].split(",");
             for (String boughtProduct : boughtProducts) {
                 
             }
         }
    }
}
