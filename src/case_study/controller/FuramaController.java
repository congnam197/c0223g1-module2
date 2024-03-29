package case_study.controller;
import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    CustomerController customerController = new CustomerController();
    EmployeeController employeeController = new EmployeeController();
    FacilityController facilityController = new FacilityController();
    BookingController bookingController = new BookingController();
    PromotionController promotionController = new PromotionController();

    public void displayMaintMenu() {

        System.out.println("-------Management Furama Resort------");
        System.out.println("-------------------------------------");
        boolean flag = true;
        do {
            System.out.println("Choose a function to continue: \n" +
                    "1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management \n" +
                    "0. Exit");
            System.out.print("Enter an option :");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    employeeController.employeeManagement();
                    break;
                case "2":
                    customerController.customerManagement();
                    break;
                case "3":
                    facilityController.facilityManagement();
                    break;
                case "4":
                    bookingController.bookingManagement();
                    break;
                case "5":
                    promotionController.promotionManagement();
                    break;
                case "0":
                    System.out.println("You have exited the system!");
                    System.exit(-1);
                    break;
                default:
                    System.out.print("It is not available, please select again:  ");
            }
        } while (flag);
    }
}
