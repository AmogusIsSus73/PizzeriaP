package src;

import java.util.ArrayList;
import java.util.List;

public class AddArrayLists {
    public static List<Integer> pizzaAmountList = new ArrayList<>();
    public static List pizzaStatusList = new ArrayList<>();

    public void orderList(){
        pizzaAmountList.add(2);
        pizzaAmountList.add(2);
        pizzaStatusList.add("Ожидает");
        pizzaStatusList.add("Ожидает");
    }
}
