import java.util.Scanner;

public class displayHello {
    public static void main(String[] args) {
       String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
