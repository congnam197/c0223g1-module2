package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner sc = new Scanner(System.in);
    CustomerService customerService=new CustomerService();
    public void customerManagement() {
        System.out.println("-----Customer Management-----");
        boolean flag = true;
        do {
            System.out.println("Chọn một trong những chức năng sau để tiếp tục");
            System.out.println("Nhập một lựa chọn:\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            String choice3 = sc.nextLine();
            switch (choice3) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
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
