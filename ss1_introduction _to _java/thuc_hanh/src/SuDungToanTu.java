import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width: ");
        width = scanner.nextFloat();
        System.out.println("Enter the Height :");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area ís : " + area);
    }
}
