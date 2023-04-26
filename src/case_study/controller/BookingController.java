package case_study.controller;

import case_study.service.BookingService;

import java.util.Scanner;

public class BookingController {
    Scanner sc = new Scanner(System.in);
    BookingService bookingService = new BookingService();
    public void bookingManagement() {
        System.out.println("-----Booking Management-----");
        boolean flag = true;
        do {
            System.out.println("Chọn một trong những chức năng để tiếp tục");
            System.out.println("Nhập một lựa chọn:\n" +
                    "1. Add new booking \n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            String choice4 = sc.nextLine();
            switch (choice4) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    flag = false;
                default:
                    System.out.println("Không có chức năng!");
            }
        } while (flag);
    }

}
