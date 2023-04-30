package case_study.controller;

import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityController {
    Scanner sc = new Scanner(System.in);
    FacilityService facilityService = new FacilityService();

    public void facilityManagement() {
        System.out.println("-----Facility Management-----");
        boolean flag = true;
        do {
            System.out.println("Chọn một trong những chức năng để tiếp tục");
            System.out.println("Nhập một lựa chọn:\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Dislay list facility maintenance\n" +
                    "4. Return main menu");
            String choice3 = sc.nextLine();
            switch (choice3) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    facilityService.add();
                    break;
                case "3":
                    facilityService.displayMaintenance();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Không có chức năng chọn");
            }
        } while (flag);
    }
}
