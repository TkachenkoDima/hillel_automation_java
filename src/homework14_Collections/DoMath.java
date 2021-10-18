package homework14_Collections;

import java.util.HashMap;
import java.util.Map;

public class DoMath {

    double seasonalDiscount = 50;

    Map<String, Double> fullPrice = new HashMap<>();

    public Map<String, Double> convertEnumToMap() {
        for (Goods goods : Goods.values()) {
            fullPrice.put(goods.getName(), goods.getPrice());
        }
        return fullPrice;
    }

    public void applyDiscountToGoods(Map<String, Double> fullPrice) {
        for (Map.Entry<String, Double> entry: fullPrice.entrySet()) {
            entry.setValue(entry.getValue()-seasonalDiscount);
        }
    }

    public void printPrices(Map<String,Double>Convert) {
        for (Map.Entry<String, Double> stringDoubleEntry : Convert.entrySet()) {
            System.out.println("Goods price: "
                    + ((Map.Entry) stringDoubleEntry).getKey() + " : "
                    + ((Map.Entry) stringDoubleEntry).getValue() + " UAH");
        }
    }
}