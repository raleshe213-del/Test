public class Task1_4{
    public static void main(String[] args) {
        int test = (new java.util.Random()).nextInt(900) + 100;
        int res = 0;
        for(int i = 0; i < 3; i++){
            res += test % 10;
            test /= 10;
        }
        System.out.println(res);
    }
}