package src;

public class Courier extends Workers {
    private int capacity;//Вместительность
    public Courier(String name_worker, int year_born,int capacity,String status) {
        super(name_worker, year_born,status);
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
}
