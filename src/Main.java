import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);


    System.out.print("Enter age : ");
    int w = scanner.nextInt();
    scanner.nextLine();
        System.out.print("Enter name : ");
        int  h = scanner.nextInt();
        int wh = w+h ;
        System.out.println( wh);
    scanner.close();
}}