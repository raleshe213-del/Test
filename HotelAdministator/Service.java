public class Service {
    private String name;
    private int cost;

    public Service(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public Service(){
        this.name = "Temp";
        this.cost = 0;
    }

    public String get_name(){
        return name;
    }
    public int get_cost(){
        return cost;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_cost(int cost){
        this.cost = cost;
    }

}
