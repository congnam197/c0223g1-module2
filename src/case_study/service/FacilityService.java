package case_study.service;

import case_study.model.FacilityModel;
import case_study.model.HouseModel;
import case_study.model.RoomModel;
import case_study.model.VillaModel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IAddService, IDisplayService, IDisplayMaintenance, IReadService {
    static Map<FacilityModel, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Map<FacilityModel, Integer> maintenanceMap = new LinkedHashMap<>();

    Scanner scanner = new Scanner(System.in);
    RoomService roomService = new RoomService();
    VillaService villaService = new VillaService();
    HouseService houseService = new HouseService();

    public Map<FacilityModel, Integer> returnMap() {
        read();
        return facilityIntegerMap;
    }

    @Override
    public void read() {
        Map<FacilityModel, Integer> mapFacility = new LinkedHashMap<>();
        Map<VillaModel, Integer> villaIntegerMap = villaService.readVilla();
        Map<RoomModel, Integer> roomIntegerMap = roomService.readRoom();
        Map<HouseModel, Integer> houseIntegerMap = houseService.readHouse();
        Set<VillaModel> villaModelSet = villaIntegerMap.keySet();
        Set<RoomModel> roomModelSet = roomIntegerMap.keySet();
        Set<HouseModel> houseModelSet = houseIntegerMap.keySet();
        for (FacilityModel villa : villaModelSet) {
            mapFacility.put(villa, villaIntegerMap.get(villa));
        }
        for (FacilityModel room : roomModelSet) {
            mapFacility.put(room, roomIntegerMap.get(room));
        }
        for (FacilityModel house : houseModelSet) {
            mapFacility.put(house, houseIntegerMap.get(house));
        }
        facilityIntegerMap = mapFacility;
    }

    @Override
    public void add() {
        boolean flag = true;
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu\n");
            System.out.print("Enter the choice: ");
            String choice3 = scanner.nextLine();
            switch (choice3) {
                case "1":
                    System.out.println("Add Villa");
                    villaService.add();
                    flag = false;
                    break;
                case "2":
                    System.out.println("Add House ");
                    houseService.add();
                    flag = false;
                    break;
                case "3":
                    System.out.println("Add Room");
                    roomService.add();
                    flag = false;
                    break;
                case "4":
                    System.out.println("Return menu");
                    flag = false;
                    break;
                default:
                    System.out.print("Incorrect entry, please select again: ");
            }
        } while (flag);
    }

    @Override
    public void display() {
        read();
        Set<FacilityModel> setList = facilityIntegerMap.keySet();
        for (FacilityModel f : setList) {
            System.out.println(f + ", Number of bookings: " + facilityIntegerMap.get(f));
        }
    }

    @Override
    public void displayMaintenance() {
        read();
        Set<FacilityModel> set = facilityIntegerMap.keySet();
        for (FacilityModel f : set) {
            if (facilityIntegerMap.get(f) > 4) {
                maintenanceMap.put(f, facilityIntegerMap.get(f));
            }
        }
        Set<FacilityModel> set1 = maintenanceMap.keySet();
        for (FacilityModel facilityModel : set1) {
            System.out.println("Facility Maintenance: ");
            System.out.println(facilityModel+ " Number of bookings: " + maintenanceMap.get(facilityModel));
        }
    }
}
