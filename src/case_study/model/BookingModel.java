package case_study.model;

public class BookingModel {
    private String codeClient;
    private String codeService;
    private String codeBooking;
    private String dateBooking;
    private String dayStart;
    private String dayEnd;

    public BookingModel() {
    }

    public BookingModel(String codeClient, String codeService, String dateBooking, String codeBooking, String dayStart, String dayEnd) {
        this.codeClient = codeClient;
        this.codeService = codeService;
        this.dateBooking = dateBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.codeBooking = codeBooking;
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

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
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

    @Override
    public String toString() {
        return "Booking : " +
                "idClient: " + codeClient +
                ", codeService: " + codeService +
                ", dateBooking: " + dateBooking +
                ", codeBooking: " + dateBooking +
                ", dayStart: " + dayStart +
                ", dayEnd: " + dayEnd;
    }

    public String getInfoToCSV() {
        return codeClient + "," + codeService + "," + dateBooking + "," + codeBooking + "," + dayStart + "," + dayEnd;
    }
}
