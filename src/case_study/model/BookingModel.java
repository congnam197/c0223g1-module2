package case_study.model;

public class BookingModel {
    private String codeClient;
    private String codeService;
    private String codeBooking;
    private String dayStart;
    private String dayEnd;
    private String nameService;
    private String typeOfService;

    public BookingModel() {
    }

    public BookingModel(String codeClient, String codeService, String codeBooking, String dayStart, String dayEnd, String nameService, String typeOfService) {
        this.codeClient = codeClient;
        this.codeService = codeService;
        this.codeBooking = codeBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking :" +
                "codeClient: " + codeClient +
                ", codeService: " + codeService +
                ", codeBooking: " + codeBooking +
                ", dayStart: " + dayStart +
                ", dayEnd: " + dayEnd +
                ", nameService: " + nameService +
                ", typeOfService: " + typeOfService ;
    }

    public String getInfoToCSV() {
        return codeClient + "," + codeService + "," + codeBooking + "," + dayStart + "," + dayEnd + "," + nameService + "," + typeOfService;
    }
}
