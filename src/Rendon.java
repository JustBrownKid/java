import java.util.Random;

public class Rendon {
    public static void main(String[] args){
        Random red = new Random();
        int x= red.nextInt(1000 , 9999);
        System.out.println(x);
    }
}
