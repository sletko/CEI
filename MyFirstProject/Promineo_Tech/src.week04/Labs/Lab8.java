package Labs;

import java.util.*;

public class Lab8 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indexVal = in.nextInt();

        List<String> productList = new ArrayList<>();
        productList.add("Macbook");
        productList.add("HP Notebook");
        productList.add("iPhone 12");
        productList.add("Acer Aspire");
        productList.add("Windows Surface");
        productList.add("Galaxy S20");

        // Check if the indexVal is valid
        if (indexVal >= 0 && indexVal < productList.size()) {
            String product = productList.get(indexVal);
            System.out.println(product);
        } else {
            System.out.println("No product can be found with that product number.");
        }
    }
}
