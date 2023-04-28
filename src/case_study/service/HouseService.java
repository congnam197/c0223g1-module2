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
//String serviceId, String serviceName, double area, double price, int maximumNumberOfPeople,
//                      String rentalType, String roomStandard, int floor) {
        System.out.print("Nhập mã nhà ở ( có dạng SVHO-YYYY) ");
        String houseID;
        boolean check1;
        do {
            houseID = scanner.nextLine();
            if (Regex.checkIdHouse(houseID)) {
                check1 = false;
            } else {
                System.out.print("Chưa đúng, vui lòng nhập lại ");
                check1 = true;
            }
        } while (check1);
        System.out.print("Nhập tên nhà ");
        String nameHouse;
        boolean check2;
        do {
            nameHouse = scanner.nextLine();
            if (Regex.checkNameService(nameHouse)) {
                check2 = false;
            } else {
                System.out.print("Nhập chưa đúng, vui lòng nhập lại ");
                check2 = true;
            }
        } while (check2);
        System.out.print("Nhập diện tích nhà ");
        String area1;
        boolean check3;
        do {
            area1 = scanner.nextLine();
            if (Regex.checkArea(area1)) {
                check3 = false;
            } else {
                System.out.print("nhâp chưa đúng, vui lòng nhập lại ");
                check3 = true;
            }
        } while (check3);
        double area = Double.parseDouble(area1);
        System.out.print("Nhập giá cho thuê ");
        String price1;
        boolean check4;
        do {
            price1 = scanner.nextLine();
            if (Regex.checkPrice(price1)) {
                check4 = false;
            } else {
                System.out.print("Nhập chưa đúng mới nhập lại ");
                check4 = true;
            }
        } while (check4);
        double price = Double.parseDouble(price1);
        System.out.print("Số người tối đa ");
        String maximumPeople1;
        boolean check5;
        do {
            maximumPeople1 = scanner.nextLine();
            if (Regex.checkNumberHumanMax(maximumPeople1)) {
                check5 = false;
            } else {
                System.out.print("Số lượng người ít nhất là 1 và tối đa là 19 người, vui lòng kiểm tra lại ");
                check5 = true;
            }
        } while (check5);
        int maximumNumberPeople = Integer.parseInt(maximumPeople1);
        System.out.println("Kiểu thuê");
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
                    System.out.println("Nhập sai, nhập lại");
            }
        } while (check6);
        System.out.print("Tiêu chuẩn phòng ");
        String roomStandard;
        boolean check7;
        do {
            roomStandard = scanner.nextLine();
            if (Regex.checkNameService(roomStandard)) {
                check7 = false;
            } else {
                System.out.print("Nhập chưa đúng, mời nhập lại ");
                check7 = true;
            }
        } while (check7);
        System.out.print("Số tầng ");
        String floor1;
        boolean check8;
        do {
            floor1 = scanner.nextLine();
            if (Regex.checkFloor(floor1)) {
                check8 = false;
            } else {
                System.out.print("Nhập chưa đúng, vui lòng nhập lại");
                check8 = true;
            }
        } while (check8);
        int floor = Integer.parseInt(floor1);
        HouseModel houseModel = new HouseModel(houseID, nameHouse, area, price, maximumNumberPeople, rentalType, roomStandard, floor);
        Integer value = 0;
        houseRepository.addHouse(houseModel, value);
        System.out.println("Thêm thành công");
    }

    @Override
    public Map<HouseModel, Integer> read() {
        Map<HouseModel, Integer> houseIntegerMap = new LinkedHashMap<>();
        houseIntegerMap = houseRepository.readHouse();
        return houseIntegerMap;
    }
}
