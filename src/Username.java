import java.util.Locale;
import java.util.Scanner;

public class Username {
        public static void main(String[] args){
            String user = "";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Your Name ");
            user += scanner.nextLine();
            String abbreviation = getInitials(user);
            System.out.println(abbreviation);

        }
        public static String getInitials(String name){
            String[] words = name.split(" ");
            StringBuilder inteintial = new StringBuilder();
            for (int i = 0 ; i<2 &&  i <words.length ; i++){
                String word = words[i];
                if (!word.isEmpty()) {
                    inteintial.append(word.charAt(0));
                }
            }
            return inteintial.toString().toUpperCase();
        }
    }
