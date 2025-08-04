import java.util.Scanner;

public class Order {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter what u want : ");
        String name = scn.nextLine();

        System.out.print("Enter Amount Of"+ name + " ");
        int price = scn.nextInt();

        System.out.print("Enter Unit For "+ name + " ");
        int unit = scn.nextInt();

        int totalPrice = price*unit;
        String Currency = "mmk";
        System.out.print(totalPrice+Currency);
    }
}
