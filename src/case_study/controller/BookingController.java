package case_study.controller;

import case_study.service.BookingService;
import case_study.service.ContractService;

import java.util.Scanner;

public class BookingController {
    Scanner sc = new Scanner(System.in);
    BookingService bookingService = new BookingService();
    ContractService contractService =new ContractService();
    public void bookingManagement() {
        System.out.println("-----Booking Management-----");
        boolean flag = true;
        do {
            System.out.println("Choose a function to continue: ");
            System.out.println("Enter an option :\n" +
                    "1. Add new booking \n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            String choice4 = sc.nextLine();
            switch (choice4) {
                case "1":bookingService.add();
                    break;
                case "2":bookingService.display();
                    break;
                case "3":contractService.create();
                    break;
                case "4":contractService.display();
                    break;
                case "5":
                    break;
                case "6":
                    flag = false;
                default:
                    System.out.print("It is not available, please select again:  ");
            }
        } while (flag);
    }

}
