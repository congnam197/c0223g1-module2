package case_study.model;

public class VillaModel extends FacilityModel {
    private String roomStandard;
    private double areaSwimmingPool;
    private int floor;

    public VillaModel() {
    }

    public VillaModel(String serviceId, String serviceName, double area, double price, int maximumNumberOfPeople, String rentalType, String roomStandard, double areaSwimmingPool, int floor) {
        super(serviceId, serviceName, area, price, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaSwimmingPool = areaSwimmingPool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public void setAreaSwimmingPool(double areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa: " +
                ", " + super.toString() +
                " ,roomStandard: " + roomStandard +
                ", areaSwimmingPool: " + areaSwimmingPool +
                ", floor: " + floor;
    }

    public String getInfoToCSV() {
        return super.showList() + roomStandard + "," + areaSwimmingPool + "," + floor;
    }
}

