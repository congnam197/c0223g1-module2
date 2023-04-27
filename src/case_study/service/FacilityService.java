package case_study.service;

import case_study.model.Facility;
import case_study.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IAddService, IDisplayService, IDisplayMaintenance, IRead {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Map<Facility, Integer> map = new LinkedHashMap<>();

    Scanner scanner = new Scanner(System.in);
    RoomService roomService = new RoomService();
    VillaService villaService = new VillaService();
    HouseService houseService = new HouseService();

    public Map<Facility, Integer> returnMap() {
        read();
        return facilityIntegerMap;
    }

    @Override
    public void read() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        Map<Villa, Integer> villaIntegerMap = villaService.readVilla();
        Set<Villa> villaSet = villaIntegerMap.keySet();
        for (Facility villa : villaSet) {
            map.put(villa, villaIntegerMap.get(villa));
        }
        facilityIntegerMap = map;
    }

    @Override
    public void add() {
        boolean flag4 = true;
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu\n");
            System.out.print("Nhập lựa chọn:");
            String choice3 = scanner.nextLine();
            switch (choice3) {
                case "1":
                    System.out.println("Add Villa");
                    villaService.add();
                    flag4 = false;
                    break;
                case "2":
                    System.out.println("Add House ");
                    houseService.add();
                    flag4 = false;
                    break;
                case "3":
                    System.out.println("Add Room");
                    roomService.add();
                    flag4 = false;
                    break;
                case "4":
                    System.out.println("return menu");
                    flag4 = false;
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng chọn lại");
            }
        } while (flag4);
    }


    @Override
    public void displayList() {
        read();
        Set<Facility> setList = facilityIntegerMap.keySet();
        for (Facility f : setList) {
            System.out.println(f + ", value" + facilityIntegerMap.get(f));
            if (facilityIntegerMap.get(f) > 4) {
                map.put(f, facilityIntegerMap.get(f));
            }
        }
    }

    @Override
    public void displayMaintenance() {
        read();
        Set<Facility> set = facilityIntegerMap.keySet();
        for (Facility f : set) {
            if (facilityIntegerMap.get(f) > 4) {
                map.put(f, facilityIntegerMap.get(f));
            }
        }
        Set<Facility> set1 = map.keySet();
        for (Facility facility : set1) {
            System.out.println(facility + " ,value:" + map.get(facility));
        }

    }
}
