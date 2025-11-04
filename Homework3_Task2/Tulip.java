public class Tulip{
    private static int count = 0;
    private static final int price = 100;

    private Tulip(){}

    public static void set_count(int count){
        Tulip.count = count;
    }

    public static int get_count(){
        return Tulip.count;
    }

    public static int price(){
        return Tulip.count * Tulip.price;
    }
}