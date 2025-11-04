public class Shop{
    public static void main(String[] args) {
        System.out.println("Creating a bouquet");
        System.out.println("With 3 roses, 2 tulips and 4 lilies");
        Rose.set_count(3);
        Lily.set_count(4);
        Tulip.set_count(2);
        System.out.println("Total price = " + (Rose.price() + Tulip.price() + Lily.price()));
    }
}