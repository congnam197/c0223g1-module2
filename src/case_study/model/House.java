package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String serviceId, String serviceName, double area, double price, int maximumNumberOfPeople, String rentalType, String roomStandard, int floor) {
        super(serviceId, serviceName, area, price, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House: " +
                super.toString() +
                ", roomStandard: " + roomStandard +
                ", floor: " + floor ;
    }

    public String getInfoToCSV() {
        return super.showList() + roomStandard + "," + floor;
    }

}
