public class Lily{
    private static int count = 0;
    private static final int price = 250;

    private Lily(){}

    public static void set_count(int count){
        Lily.count = count;
    }

    public static int get_count(){
        return Lily.count;
    }

    public static int price(){
        return Lily.count * Lily.price;
    }
}