import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm: ");
        year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d là năm nhuận", year);
                } else {
                    System.out.printf("%d Không là năm nhuận", year);
                }
            } else {
                System.out.printf("%d là năm nhuận", year);
            }
        } else {
            System.out.printf("%d Không là năm nhuận", year);
        }
    }
}
