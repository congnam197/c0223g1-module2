package case_study.controller;

import case_study.service.class_service.PromotionService;

import java.util.Scanner;

public class PromotionController {
Scanner sc = new Scanner(System.in);
PromotionService promotionService = new PromotionService();
    public void promotionManagement() {
        System.out.println("-----Promotion Management-----");
        boolean flag = true;
        do {
            System.out.print("Enter an option : \n" +
                    "1. Display list customers use service\n" +
                    "3. Display list customers get voucher \n" +
                    "3. Return main menu:  ");
            String choice5 = sc.nextLine();
            switch (choice5) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    flag = false;
                default:
                    System.out.print("It is not available, please select again:  ");
            }
        } while (flag);
    }
}
