package ss19_string_va_regex.bai_tap.vilidate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX = "^((84)-(0)|0)[1-9]{1}\\d{8}$";

    public static boolean checkNumberPhone(String numberPhone) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }
}
