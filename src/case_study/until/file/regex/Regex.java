package case_study.until.file.regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean checkNamePerson(String name) {
        final String REGEX_NAME = "^([A-Z]{1}[a-z]{2,9}(\\s){1}){1,3}([A-Z]{1}[a-z]{2,9}){1}$";
        return name.matches(REGEX_NAME) ? true : false;
    }

    public static boolean checkCodePerson(String code) {
        final String REGEX_CODE_EMPLOYEE = "^((NV){1}(-){1})([0-9]{4})$";
        return code.matches(REGEX_CODE_EMPLOYEE) ? true : false;
    }

    public static boolean checkIdCard(String idCard) {
        final String REGEX_IDCARD = "^(([0-9]{9})|([0-9]{12}))$";
        Pattern pattern = Pattern.compile(REGEX_IDCARD);
        Matcher matcher = pattern.matcher(idCard);
        return matcher.matches();
    }

    public static boolean checkAge(String age) {
        final String REGEX_AGE = "^(((0)[1-9])|((1|2)[0-9])|((3)[0-1])){1}(-){1}((0)[1-9]|(1)[0-2]){1}(-){1}((1)|(2))[0-9]{3}$";
        return age.matches(REGEX_AGE) ? true : false;
    }

    public static boolean checkNumberPhone(String numberPhone) {
        final String REGEX_NUMBERPHONE = "^((0){1})([1-9]{9})$";
        Pattern pattern = Pattern.compile(REGEX_NUMBERPHONE);
        Matcher matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }

    public static boolean checkIdVilaa(String idVilla) {
        final String REGEX_IDVILLA = "^(SVVL-){1}[0-9]{4}$";
        return idVilla.matches(REGEX_IDVILLA) ? true : false;
    }

    public static boolean checkIdHouse(String idHouse) {
        final String REGEX_INDHOUSE = "^(SVHO-){1}[0-9]{4}$";
        return idHouse.matches(REGEX_INDHOUSE) ? true : false;
    }

    public static boolean checkIdRoom(String idRoom) {
        final String REGEX_IDROOM = "^(SVRO-){1}[0-9]{4}$";
        return idRoom.matches(REGEX_IDROOM) ? true : false;
    }

    public static boolean checkNameService(String nameService) {
        final String REGEX_NAMESERVICE = "^([A-Z]{1})([a-z]+)$";
        return nameService.matches(REGEX_NAMESERVICE) ? true : false;
    }

    public static boolean checkUnderAge(String age) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String st = sdf.format(date);
        System.out.println("Ngày hôm nay: "+st);
        Date date1 = null;
        try {
            date1 = sdf.parse(age);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date1.compareTo(date) < 18) {
            return true;
        }
        return false;
    }
}
