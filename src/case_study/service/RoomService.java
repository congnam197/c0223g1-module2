package case_study.service;

import case_study.model.RoomModel;
import case_study.repository.RoomRepository;
import case_study.until.file.regex.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomService implements IAddService,IReadRoom {
    Scanner scanner = new Scanner(System.in);
    RoomRepository roomRepository = new RoomRepository();
    static Map<RoomModel,Integer> roomIntegerMap =new LinkedHashMap<>();

    @Override
    public void add() {
        System.out.print("Nhập mã Phòng có định dạng SVRO-YYYY ");
        boolean check1;
        String serviceID;
        do {
            serviceID = scanner.nextLine();
            if (Regex.checkIdRoom(serviceID)) {
                check1 = false;
            } else {
                System.out.print("Mã chưa đúng định dạng,vui lòng nhập lại  ");
                check1 = true;
            }
        } while (check1);
        System.out.print("Nhập tên Phòng ");
        String serviceName;
        boolean check2;
        do {
            serviceName = scanner.nextLine();
            if (Regex.checkNameService(serviceName)) {
                check2 = false;
            } else {
                System.out.print("Nhập chưa đúng mời nhập lại ");
                check2 = true;
            }
        } while (check2);
        System.out.print("Nhập diện tích phòng ");
        boolean check3;
        String area1;
        do {
            area1 = scanner.nextLine();
            if (Regex.checkArea(area1)) {
                check3 = false;
            } else {
                System.out.print("Nhập chưa đúng, mời nhập lại ");
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
                    System.out.println("Year");
                    rentalType = scanner.nextLine() + "Year";
                    check6 = false;
                    break;
                case "2":
                    System.out.println("Month");
                    rentalType = scanner.nextLine() + "Month";
                    check6 = false;
                    break;
                case "3":
                    System.out.println("Day");
                    rentalType = scanner.nextLine() + "Day";
                    check6 = false;
                    break;
                case "4":
                    System.out.println("Hour");
                    rentalType = scanner.nextLine() + "Hour";
                    check6 = false;
                    break;
                default:
                    System.out.println("Nhập sai, nhập lại");
            }
        } while (check6);
        System.out.print("Dịch vụ miễn phí đi kèm ");
        String serviceFree = scanner.nextLine();
        RoomModel roomModel = new RoomModel(serviceID, serviceName, area, price, maximumNumberPeople, rentalType, serviceFree);
        Integer value = 0;
        roomRepository.addRoom(roomModel,value);
        System.out.println("Đã thêm thành công!");
    }

    @Override
    public Map<RoomModel, Integer> read() {
        roomIntegerMap=roomRepository.readRoom();
        return roomIntegerMap;
    }
}
