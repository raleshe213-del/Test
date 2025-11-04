public class Rose{
    private static int count = 0;
    private static final int price = 150;

    private Rose(){}

    public static void set_count(int count){
        Rose.count = count;
    }

    public static int get_count(){
        return Rose.count;
    }

    public static int price(){
        return Rose.count * Rose.price;
    }
}