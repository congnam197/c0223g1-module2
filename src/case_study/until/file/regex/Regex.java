package case_study.until.file.regex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_NAME = "^([A-Z][a-z]{2,9}(\\s)){1,3}([A-Z][a-z]{2,9})$";
    private static final String REGEX_CODE_EMPLOYEE = "^((NV)(-))([0-9]{4})$";
    private static final String REGEX_CODE_CUSTOMER = "^((KH)(-))([0-9]{4})$";
    private static final String REGEX_IDCARD = "^(([0-9]{9})|([0-9]{12}))$";
    private static final String REGEX_AGE = "^(((1)|(2))[0-9]{3})(-)((0)[1-9]|(1)[0-2])(-)(((0)[1-9])|((1|2)[0-9])|((3)[0-1]))$";
    private static final String REGEX_NUMBERPHONE = "^((0))([1-9]{9})$";
    private static final String REGEX_IDVILLA = "^(SVVL-)[0-9]{4}$";
    private static final String REGEX_INDHOUSE = "^(SVHO-)[0-9]{4}$";
    private static final String REGEX_IDROOM = "^(SVRO-)[0-9]{4}$";
    private static final String REGEX_AREA = "^([3-9][0-9])|([1-9][0-9]{2,})$";
    private static final String REGEX_NAMESERVICE = "^([A-Z])([a-z]+)$";
    private static final String REGEX_PRICE = "^[0-9]+$";
    private static final String REGEX_FLOOR = "^[0-9]+$";
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

    public static boolean checkAge(String age) {
        return age.matches(REGEX_AGE) ? true : false;
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
//        LocalDateTime date = LocalDateTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String st = dtf.format(date);
//        System.out.println("Ngày hôm nay: " + st);
//        LocalDateTime date1 = LocalDateTime.parse(age, dtf);
//        LocalDateTime dateTime1 = date.minusYears(18);
//        LocalDateTime dateTime2 = date1.plusYears(0);
//        boolean flag = dateTime1.isAfter(dateTime2);
//        if (flag) {
//            return true;
//        } else {
//            return false;
//        }
        return true;
    }

}
