import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nhập số có 3 chữ số : ");
        int number = Integer.parseInt(scaner.nextLine());
        if (number > 999) {
            System.out.print("Nhâp lại");
        } else if (number > 0 && number < 10) {
            switch (number) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("out of ability");

            }

        }else if (number)
    }
}
