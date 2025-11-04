public class Administrate {

    private Administrate(){}

    public void get_in_room(Person person, Room room){
        room.set_person(person);
        System.out.println("The resident with name " + person.get_name() + " has get in room " + room.get_number());
    }

    public void out_room(Room room){
        room.set_person(null);
        System.out.println("The romm is free by the nunber " + room.get_number());
    }

    public void change_state(Room room, String new_state){
        room.set_state(new_state);
        System.out.println("The state of room has changed");
    }

    public void change_price_room(Room room, int new_price){
        room.set_cost(new_price);
        System.out.println("Price changed");
    }

    public void change_price_service(Service service, int new_price){
        service.set_cost(new_price);
    }

    public Room new_room(){
        System.out.println("Room has constructed");
        return new Room();
    }

    public Service new_service(){
        System.out.println("Service has constructe");
        return new Service();
    }
}
