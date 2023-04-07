package src;

import java.util.List;


public class Bakers extends Workers{
    private int work_exp;
    public Bakers(String name_worker,int year_born,int work_exp,String status){
        super(name_worker,year_born,status);
        this.work_exp = work_exp;
    }
    public int getWork_exp(){
        return work_exp;
    }
    public Object getOrder(){
        AddArrayLists addArrayLists = new AddArrayLists();
        Pizzeria pizzeria = new Pizzeria();

        for (int i = 0; i < AddArrayLists.pizzaAmountList.get(0);i++) {
            pizzeria.pizza[i] = 1;
        }
        AddArrayLists.pizzaStatusList.set(0,"Готово");
        return AddArrayLists.pizzaStatusList.get(0);
    }
}
