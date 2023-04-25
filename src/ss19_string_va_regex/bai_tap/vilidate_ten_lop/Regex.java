package ss19_string_va_regex.bai_tap.vilidate_ten_lop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public static boolean checkNameClass(String className) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
