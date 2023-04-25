package ss19_string_va_regex.thuc_hanh.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invaliEmail = new String[]{"@gmail.com", "ab@gmail", "@#abc@hotmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validata(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invaliEmail) {
            boolean isvalid = emailExample.validata(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
