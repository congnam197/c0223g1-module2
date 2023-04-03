import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số (từ 0-999): ");
        int numb = Integer.parseInt(scanner.nextLine());
        if (numb > 0 && numb < 10) {
            switch (numb) {
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
                    System.out.print("Out of ability");
            }
        }else if (numb<20){
            
        }
    }
}
