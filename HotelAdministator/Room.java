public class Room {
    private int number;
    private int cost;
    private Service[] services;
    private Person resident;
    private String state;

    public Room(int number, int cost, Service[] services){
        this.number = number;
        this.cost = cost;
        this.services = services;
    }

    public Room(){
        this.number = 999;
        this.cost = 999;
        this.services = null;
    }

    public int get_number(){return number;}
    public int get_cost(){return cost;}
    public Service[] get_services(){return services;}
    public Person get_person(){return resident;}
    public String get_state(){return state;}

    public void set_number(int number){this.number = number;}
    public void set_cost(int cost){this.cost = cost;}
    public void set_services (Service[] services){this.services = services;}
    public void set_person(Person resident){this.resident = resident;}
    public void set_state(String state){this.state = state;}
}
