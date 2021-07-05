import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        number = sc.nextInt();
        int a = (int) Math.floor(number/100);
        int b = (int)Math.floor((number-a*100)/10);
        int c = (int) (number - a*100 - b*10);
        String reada="";
        String readb="";
        String readc="";
        switch (a) {
            case 1:
                reada = "One hundred";
                break;
            case 2:
                reada = "Two hundred";
                break;
            case 3:
                reada = "Three hundred";
                break;
            case 4:
                reada = "Four hundred";
                break;
            case 5:
                reada = "Five hundred";
                break;
            case 6:
                reada = "Six hundred";
                break;
            case 7:
                reada = "Seven hundred";
                break;
            case 8:
                reada = "Eight hundred";
                break;
            case 9:
                reada = "Nine hundred";
                break;
        }
        switch (b) {
            case 2:
                readb = "Twenty";
                break;
            case 3:
                readb = "Thirty";
                break;
            case 4:
                readb = "Fouty";
                break;
            case 5:
                readb = "Fifty";
                break;
            case 6:
                readb = "Sixty";
                break;
            case 7:
                readb = "Seventy";
                break;
            case 8:
                readb = "Eighty";
                break;
            case 9:
                readb = "Ninety";
                break;
        }
        switch (c) {
            case 1:
                readc = "One";
                break;
            case 2:
                readc = "Two";
                break;
            case 3:
                readc = "Three";
                break;
            case 4:
                readc = "Four";
                break;
            case 5:
                readc = "Five";
                break;
            case 6:
                readc = "Six";
                break;
            case 7:
                readc = "Seven";
                break;
            case 8:
                readc = "Eight";
                break;
            case 9:
                readc = "Nine";
                break;
        }
        if (b == 1) {
            readc = "";
            switch (c) {
                case 0:
                    readb = "Ten";
                case 1:
                    readb = "Eleven";
                case 2:
                    readb = "Twelve";
                case 3:
                    readb = "Thirteen";
                case 4:
                    readb = "Fourteen";
                case 5:
                    readb = "Fifteen";
                case 6:
                    readb = "Sixteen";
                case 7:
                    readb = "Seventeen";
                case 8:
                    readb = "Eighteen";
                case 9:
                    readb = "Nineteen";
            }
        }
        if (reada != "") {
            String result = reada + " and " + readb + " " + readc;
            System.out.println(result);
        }else {
            String result = readb + " " + readc;
            System.out.println(result);
        }
    }
}
