package case_study.service;

import case_study.model.VillaModel;
import case_study.repository.IVillaRepository;
import case_study.repository.VillaRepository;
import case_study.until.file.regex.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IReadVilla, IAddService {
    Scanner scanner = new Scanner(System.in);
    static Map<VillaModel, Integer> villaServiceMap = new LinkedHashMap<>();
    IVillaRepository villaRepository = new VillaRepository();

    @Override
    public Map<VillaModel, Integer> readVilla() {
        villaServiceMap = villaRepository.readVillaRepository();
        return villaServiceMap;
    }

    @Override
    public void add() {
        readVilla();
        System.out.println("Enter the Villa ID into the format SVVL-XXXX");
        boolean flag1 = true;
        String id;
        do {
            id = scanner.nextLine();
            if (Regex.checkIdVilaa(id)) {
                flag1 = false;
            } else {
                System.out.println("Incorrect format, please re- enter:  ");
            }
        } while (flag1);
        System.out.println("Enter the service's name ");
        boolean flag2 = true;
        String nameService;
        do {
            nameService = scanner.nextLine();
            if (Regex.checkNameService(nameService)) {
                flag2 = false;
            } else {
                System.out.println("Incorrect format, please re- enter:  ");
            }
        } while (flag2);
        System.out.println("Enter the room's area: ");
        String area1;
        boolean flag3 = true;
        do {
            area1 = scanner.nextLine();
            if (Regex.checkArea(area1)) {
                flag3 = false;
            } else {
                System.out.println("Incorrect format, please re- enter:  ");
            }
        } while (flag3);
        double area = Double.parseDouble(area1);
        System.out.println("Enter rental price:  ");
        String price1;
        boolean flag4 = true;
        do {
            price1 = scanner.nextLine();
            if (Regex.checkPrice(price1)) {
                flag4 = false;
            } else {
                System.out.println("Incorrect format, please re- enter:  ");
            }
        } while (flag4);
        double price = Double.parseDouble(price1);
        System.out.println("Maximum number of persons:  ");
        String numberHumanMax1;
        boolean flag5 = true;
        do {
            numberHumanMax1 = scanner.nextLine();
            if (Regex.checkNumberHumanMax(numberHumanMax1)) {
                flag5 = false;
            } else {
                System.out.println("The minimum number of persons is 1 and the maximum is 19, please verify again:  ");
            }
        } while (flag5);
        int numberHumanMax = Integer.parseInt(numberHumanMax1);
        System.out.println("Rental type");
        String rentalType = null;
        boolean flag6 = true;
        do {
            System.out.print("1.Year\n" +
                    "2.Month\n" +
                    "3.Day\n" +
                    "4.Hour: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Year ");
                    rentalType = scanner.nextLine() + "Year";
                    flag6 = false;
                    break;
                case "2":
                    System.out.print("Month ");
                    rentalType = scanner.nextLine() + "Month";
                    flag6 = false;
                    break;
                case "3":
                    System.out.print("Day ");
                    rentalType = scanner.nextLine() + "Day";
                    flag6 = false;
                    break;
                case "4":
                    System.out.print("Hour ");
                    rentalType = scanner.nextLine() + "Hour";
                    flag6 = false;
                    break;
                default:
                    System.out.println("It is not available, please select again: ");
            }
        } while (flag6);

        System.out.print("Room standard: ");
        boolean flag7 = true;
        String roomStandard;
        do {
            roomStandard = scanner.nextLine();
            if (Regex.checkNameService(nameService)) {
                flag7 = false;
            } else {
                System.out.println("Incorrect format, please re- enter:  ");
            }
        } while (flag7);

        System.out.print("Enter pool area: ");
        String areaPool1;
        boolean flag8 = true;
        do {
            areaPool1 = scanner.nextLine();
            if (Regex.checkArea(areaPool1)) {
                flag8 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
            }
        } while (flag8);
        double areaPool = Double.parseDouble(areaPool1);
        System.out.print("Enter the house's floor: ");
        String numberOfFloors1;
        boolean flag9 = true;
        do {
            numberOfFloors1 = scanner.nextLine();
            if (Regex.checkFloor(numberOfFloors1)) {
                flag9 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
            }
        } while (flag9);
        int numberOfFloors = Integer.parseInt(numberOfFloors1);
        VillaModel villaModel = new VillaModel(id, nameService, area, price, numberHumanMax, rentalType, roomStandard, areaPool, numberOfFloors);
        Integer value = 0;
        villaServiceMap.put(villaModel, value);
        villaRepository.addVillaRepository(villaModel, value);
        System.out.println("Successfully added! ");
    }
}
