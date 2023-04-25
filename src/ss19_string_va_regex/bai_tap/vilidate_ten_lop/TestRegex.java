package ss19_string_va_regex.bai_tap.vilidate_ten_lop;


public class TestRegex {
    private static Regex nameClass;
    public static final String[] validNameClass = new String[]{"C0223G", "A0323K"};
    public static final String[] invaliNameClass = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        nameClass = new Regex();
        for (String nameClass : validNameClass) {
            System.out.println(Regex.checkNameClass(nameClass));
        }
        for (String namClass : invaliNameClass) {
            System.out.println(Regex.checkNameClass(namClass));
        }
    }
}
