public class PersonnelRoom extends Room {
    private String name_of_employee;

    public PersonnelRoom(int number, int cost, Service[] services, String name_of_employee){
        super(number, cost, services);
        this.name_of_employee = name_of_employee;
    }

    public PersonnelRoom(){
        super();
        this.name_of_employee = "Temp";
    }

    public String get_name_empl(){return name_of_employee;}
    public void set_name_empl(String name){this.name_of_employee = name;}
}
