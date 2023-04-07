package src;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    public int[] pizza = new int[10];

    public static void main(String[] args) {

        AddArrayLists addArrayLists = new AddArrayLists();
        addArrayLists.orderList();
        Bakers baker1 = new Bakers("Михаил", 2020, 3, "Работает");
        String x1 = "Ожидает";
        if(x1.equals(AddArrayLists.pizzaStatusList.get(0))){
            AddArrayLists.pizzaStatusList.set(0,"Готовится");
            System.out.println(AddArrayLists.pizzaStatusList.get(0));
            System.out.println(baker1.getOrder());
        }
    }
}
