package homework14_Collections;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DoMath doMath = new DoMath();

        Map<String, Double> prices = doMath.convertEnumToMap();
        doMath.printPrices(prices);
        System.out.println("=====");
        doMath.applyDiscountToGoods(prices);
        doMath.printPrices(prices);
    }
}
