import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Transaction {

    public static String generateTransactionId(String userId) {
        // ၁။ အချိန်နှင့်ရက်စွဲကို ရယူခြင်း (Timestamp)
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String timestamp = now.format(formatter);

        // ၂။ ကျပန်းနံပါတ် (Random Number) ကို ဖန်တီးခြင်း
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000; // 4-digit random number

        // ၃။ အချက်အလက်အားလုံးကို ပေါင်းစပ်ခြင်း
        // User ID, Timestamp, Random Number တို့ကို ပေါင်းစပ်လိုက်ပါတယ်။
        String transactionId = "TXN-" + userId + "-" + timestamp + "-" + randomNumber;

        return transactionId;
    }

    public static void main(String[] args) {
        String userId = "KBZ-00123456";
        String newTransactionId = generateTransactionId(userId);
        System.out.println("Generated Transaction ID: " + newTransactionId);
    }
}