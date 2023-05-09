package case_study.model.facility;

public class RoomModel extends FacilityModel {
    private String serviceFree;

    public RoomModel() {
    }

    public RoomModel(String serviceId, String serviceName, double area, double price, int maximumNumberOfPeople, String rentalType, String serviceFree) {
        super(serviceId, serviceName, area, price, maximumNumberOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room: " +
                super.toString() + ", serviceFree: " + serviceFree;
    }

    public String getInfoToCSV() {
        return super.showList() + serviceFree;
    }
}
