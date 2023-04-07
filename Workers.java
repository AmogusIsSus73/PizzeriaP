package src;

public class Workers {
    private String name_worker;
    private int year_born;//год_рождения
    private String status;
    public Workers(String name_worker,int year_born,String status){
        this.name_worker = name_worker;
        this.year_born = year_born;
        this.status = status;
    }
    public String getName_worker(){
        return name_worker;
    }
    public int getYear_born(){
        return year_born;
    }
    public String getStatus(){return status;}
}
