import java.util.Scanner;

public class moneyChange {
    public static void main(String[] args) {
        final float money = 24000;
        float USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money USD: ");
        USD = scanner.nextFloat();
        float VND = USD*money;
        System.out.printf("Money Change is: %.3f VND", VND);
    }
}
