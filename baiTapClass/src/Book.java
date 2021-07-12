import java.util.Scanner;

public class Book {
    private int bookCode;
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(int bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array to keyboard");
        int number = scanner.nextInt();
        //Tao mang luu book duoc nhap tu ban phim
        Book array[] = setArrayBook(number);
        scanner.nextLine();
        //Tim sach
        System.out.println("Input name book to search");
        String name = scanner.nextLine();
        int index = searchBoookName(name, array);
        outBook(array, index);
        double price = scanner.nextDouble();
        index = searchBookPrice(price, array);
        outBook(array, index);
    }

    private static void outBook(String[] args) {
        if (index == -1) {
            System.out.println("Not foud book");
        } else {
            System.out.println(convertObjectToString(index, array));
        }
        System.out.println("Input price book to search");
    }

    // Nhap book, code, price, author
    public static Book setBookNew(Book book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input bookCode");
        book.setBookCode(scanner.nextInt());
        System.out.println("Input price Book");
        book.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Input bookName");
        book.setName(scanner.nextLine());
        System.out.println("Input name author");
        book.setAuthor(scanner.nextLine());
        return book;
    }

    // So luong sach trong mang Book la n
    public static Book[] setArrayBook(int n) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Add a book in index \t " + i);
            Book book = new Book();
            array[i] = setBookNew(book);
        }
        return array;
    }

    public static int searchBoookName(String name, Book array[]) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].name)) {
                index = i;
            }
        }
        return index;
    }

    public static int searchBookPrice(double price, Book array[]) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (price == array[i].price) {
                index = i;
            }
        }
        return index;
    }

    public static String convertObjectToString(int index, Book array[]) {
        return "Name:\t" + array[index].name + "Price:\t" + array[index].price + "BookCode:\t" + array[index].bookCode
                + "Author:\t" + array[index].author;
    }
}
}
