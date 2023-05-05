package case_study.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingModel implements Comparable<BookingModel> {
    private String idClient;
    private String codeService;
    private String codeBooking;
    private String dateBooking;
    private String dayStart;
    private String dayEnd;

    public BookingModel() {
    }

    public BookingModel(String idClient, String codeService, String codeBooking, String dateBooking, String dayStart, String dayEnd) {
        this.idClient = idClient;
        this.codeService = codeService;
        this.dateBooking = dateBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.codeBooking = codeBooking;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
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
    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
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
                "idClient: " + idClient +
                ", codeService: " + codeService +
                ", codeBooking: " + codeBooking +
                ", dateBooking: " + dateBooking +
                ", dayStart: " + dayStart +
                ", dayEnd: " + dayEnd;
    }

    public String getInfoToCSV() {
        return idClient + "," + codeService + "," + codeBooking + "," + dateBooking+ "," + dayStart + "," + dayEnd;
    }

    @Override
    public int compareTo(BookingModel o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        Date dateStart = null;
        Date dateStartO = null;
        Date dateEnd = null;
        Date dateEndO = null;
        try {
            dateStart = sdf.parse(this.dayStart);
            dateStartO = sdf.parse(o.dayStart);
            dateEnd = sdf.parse(this.dayEnd);
            dateEndO = sdf.parse(o.dayEnd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (this.dayStart.equals(o.dayStart)) {
            return dateEndO.after(dateEnd) ? 1 : -1;

        } else {
            return dateStartO.after(dateStart) ? 1 : -1;
        }
    }
}
