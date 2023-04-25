package ss19_string_va_regex.thuc_hanh.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX="^[A-zA-z0-9]+[A-zA-z0-9]*@[A-Za-z0-9]+(\\.[A-zA-z0-9]+)$";
    public EmailExample(){
        pattern=Pattern.compile(EMAIL_REGEX);
    }

    public boolean validata(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
