package case_study.service;

import case_study.model.HouseModel;
import case_study.repository.HouseRepository;
import case_study.until.file.regex.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements IAddService, IReadHouse {
    Scanner scanner = new Scanner(System.in);
    HouseRepository houseRepository = new HouseRepository();

    @Override
    public void add() {
        System.out.print("Enter the house's code ( có dạng SVHO-YYYY) ");
        String houseID;
        boolean check1;
        do {
            houseID = scanner.nextLine();
            if (Regex.checkIdHouse(houseID)) {
                check1 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
                check1 = true;
            }
        } while (check1);
        System.out.print("Enter the service's name: ");
        String nameHouse;
        boolean check2;
        do {
            nameHouse = scanner.nextLine();
            if (Regex.checkNameService(nameHouse)) {
                check2 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
                check2 = true;
            }
        } while (check2);
        System.out.print("Enter the house's area: ");
        String area1;
        boolean check3;
        do {
            area1 = scanner.nextLine();
            if (Regex.checkArea(area1)) {
                check3 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:   ");
                check3 = true;
            }
        } while (check3);
        double area = Double.parseDouble(area1);
        System.out.print("Enter rental price: ");
        String price1;
        boolean check4;
        do {
            price1 = scanner.nextLine();
            if (Regex.checkPrice(price1)) {
                check4 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:   ");
                check4 = true;
            }
        } while (check4);
        double price = Double.parseDouble(price1);
        System.out.print("Maximum number of persons: ");
        String maximumPeople1;
        boolean check5;
        do {
            maximumPeople1 = scanner.nextLine();
            if (Regex.checkNumberHumanMax(maximumPeople1)) {
                check5 = false;
            } else {
                System.out.print("The minimum number of persons is 1 and the maximum is 19, please verify again: ");
                check5 = true;
            }
        } while (check5);
        int maximumNumberPeople = Integer.parseInt(maximumPeople1);
        System.out.println("Rental type");
        String rentalType = null;
        boolean check6 = true;
        do {
            System.out.print("1.Year\n" +
                    "2.Month\n" +
                    "3.Day\n" +
                    "4.Hour ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Year ");
                    rentalType = scanner.nextLine() + "Year";
                    check6 = false;
                    break;
                case "2":
                    System.out.print("Month ");
                    rentalType = scanner.nextLine() + "Month";
                    check6 = false;
                    break;
                case "3":
                    System.out.print("Day ");
                    rentalType = scanner.nextLine() + "Day";
                    check6 = false;
                    break;
                case "4":
                    System.out.print("Hour ");
                    rentalType = scanner.nextLine() + "Hour";
                    check6 = false;
                    break;
                default:
                    System.out.println("It is not available, please select again: ");
            }
        } while (check6);
        System.out.print("Room standard: ");
        String roomStandard;
        boolean check7;
        do {
            roomStandard = scanner.nextLine();
            if (Regex.checkNameService(roomStandard)) {
                check7 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:   ");
                check7 = true;
            }
        } while (check7);
        System.out.print("Enter the house's floor: ");
        String floor1;
        boolean check8;
        do {
            floor1 = scanner.nextLine();
            if (Regex.checkFloor(floor1)) {
                check8 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:   ");
                check8 = true;
            }
        } while (check8);
        int floor = Integer.parseInt(floor1);
        HouseModel houseModel = new HouseModel(houseID, nameHouse, area, price, maximumNumberPeople, rentalType, roomStandard, floor);
        Integer value = 0;
        houseRepository.addHouse(houseModel, value);
        System.out.println("Successfully added! ");
    }

    @Override
    public Map<HouseModel, Integer> readHouse() {
        Map<HouseModel, Integer> houseIntegerMap = new LinkedHashMap<>();
        houseIntegerMap = houseRepository.readHouse();
        return houseIntegerMap;
    }
}
