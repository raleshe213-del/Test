public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){
        this.name = "Temp";
        this.age = 0;
    }

    public int get_age(){
        return age;
    }
    public String get_name(){
        return name;
    }
    public void set_age(int age){
        this.age = age;
    }
    public void set_name(String name){
        this.name = name;
    }

}
