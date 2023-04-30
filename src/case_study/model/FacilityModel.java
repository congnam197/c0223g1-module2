package case_study.model;

public abstract class FacilityModel {
    private final String COMMA = ",";
    private String serviceId;
    private String serviceName;
    private double area;
    private double price;
    private int maximumNumberOfPeople;
    private String rentalType;

    public FacilityModel() {
    }

    public FacilityModel(String serviceId, String serviceName, double area, double price,
                         int maximumNumberOfPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceId:" + serviceId +
                        ", serviceName:" + serviceName +
                        ", area:" + area +
                        ", price:" + price +
                        ", maximumNumberOfPeople:" + maximumNumberOfPeople +
                        ", rentalType:" + rentalType;
    }

    public String showList() {
        return serviceId + COMMA + serviceName + COMMA + area + COMMA + price + COMMA +
                maximumNumberOfPeople + COMMA + rentalType + COMMA;
    }
}
