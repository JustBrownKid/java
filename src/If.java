import java.util.Scanner;

public class If {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("your age : ");
        int age = input.nextInt();

        if (age >= 18 ){
            System.out.println(" Your are adult");
        }else {
            System.out.println("You are not adult");
        }
    }
}
