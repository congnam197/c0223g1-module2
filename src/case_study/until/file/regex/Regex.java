package case_study.until.file.regex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_NAME = "^([A-Z][a-z]+(\\s)){1,3}([A-Z][a-z]{1,9})$";
    private static final String REGEX_CODE_EMPLOYEE = "^((NV)(-))([0-9]{4})$";
    private static final String REGEX_CODE_CUSTOMER = "^((KH)(-))([0-9]{4})$";
    private static final String REGEX_IDCARD = "^(([0-9]{9})|([0-9]{12}))$";
    private static final String REGEX_DAY = "^(((0)[1-9]|[1-9])|((1|2)[0-9])|((3)[0-1]))(-)(((0)[1-9]|[1-9])|(1)[0-2])(-)(((1)|(2))[0-9]{3})$";
    private static final String REGEX_NUMBERPHONE = "^((0))([1-9]{9})$";
    private static final String REGEX_IDVILLA = "^(SVVL-)[0-9]{4}$";
    private static final String REGEX_INDHOUSE = "^(SVHO-)[0-9]{4}$";
    private static final String REGEX_IDROOM = "^(SVRO-)[0-9]{4}$";
    private static final String REGEX_AREA = "^([3-9][0-9])|([1-9][0-9]{2,})$";
    private static final String REGEX_NAMESERVICE = "^([A-Z])([a-z]+)$";
    private static final String REGEX_PRICE = "^[1-9]+$";
    private static final String REGEX_FLOOR = "^[1-9]+$";
    private static final String REGEX_NUMBER_HUMANMAX = "^(1[0-9]+)|[1-9]$";

    public static boolean checkNamePerson(String name) {
        return name.matches(REGEX_NAME) ? true : false;
    }

    public static boolean checkCodeEmployee(String code) {
        return code.matches(REGEX_CODE_EMPLOYEE) ? true : false;
    }

    public static boolean checkCodeCustomer(String code) {
        return code.matches(REGEX_CODE_CUSTOMER) ? true : false;
    }

    public static boolean checkIdCard(String idCard) {
        Pattern pattern = Pattern.compile(REGEX_IDCARD);
        Matcher matcher = pattern.matcher(idCard);
        return matcher.matches();
    }

    public static boolean checkDay(String age) {
        return age.matches(REGEX_DAY) ? true : false;
    }

    public static boolean checkNumberPhone(String numberPhone) {
        Pattern pattern = Pattern.compile(REGEX_NUMBERPHONE);
        Matcher matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }

    public static boolean checkIdVilaa(String idVilla) {

        return idVilla.matches(REGEX_IDVILLA) ? true : false;
    }

    public static boolean checkIdHouse(String idHouse) {

        return idHouse.matches(REGEX_INDHOUSE) ? true : false;
    }

    public static boolean checkIdRoom(String idRoom) {

        return idRoom.matches(REGEX_IDROOM) ? true : false;
    }

    public static boolean checkNameService(String nameService) {

        return nameService.matches(REGEX_NAMESERVICE) ? true : false;
    }

    public static boolean checkArea(String str) {

        return (str.matches(REGEX_AREA));
    }

    public static boolean checkPrice(String str) {

        return (str.matches(REGEX_PRICE));
    }

    public static boolean checkFloor(String str) {

        return (str.matches(REGEX_FLOOR));
    }

    public static boolean checkNumberHumanMax(String str) {

        return (str.matches(REGEX_NUMBER_HUMANMAX));
    }

    public static boolean checkUnderAge(String age) {
        DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        Date date1;
        Date date2;
        try {
            String startDate = age;
            String endDate = simpleDateFormat.format(currentDate);
            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);
            long getDiff = date2.getTime() - date1.getTime();
            long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);
            if (getDaysDiff > 365 * 18) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checkDayBooking(String stringDate) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = null;
        try {
            date1 = sdf.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date1.compareTo(date) < 0) {
            return true;
        }
        return false;
    }

    public static boolean checkDayStartAndDayEnd(String startDay, String endDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        Date dateStart = null;
        Date dateEnd = null;
        try {
            dateStart = sdf.parse(startDay);
            dateEnd = sdf.parse(endDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (dateEnd.compareTo(dateStart) >= 0) {
            return true;
        }
        return false;
    }
}
