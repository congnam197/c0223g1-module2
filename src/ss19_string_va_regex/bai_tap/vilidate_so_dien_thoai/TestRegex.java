package ss19_string_va_regex.bai_tap.vilidate_so_dien_thoai;

public class TestRegex {
    private static RegexExample numberPhone;
    public static final String[] validNumberPhone = new String[]{"84-0978489648","84-0979274983","0987623890"};
    public static final String[] invaliNumberPhone = new String[]{"a8-22222222", "84-22b22222", "84-9978489648","0098724608"};

    public static void main(String[] args) {
        System.out.println("Chỉ Đang kiểm tra số điện thoại của Việt Nam");
        numberPhone=new RegexExample();
        for (String numberPhone:validNumberPhone) {
            System.out.println(RegexExample.checkNumberPhone(numberPhone));
        }
        for (String numPhone:invaliNumberPhone) {
            System.out.println(RegexExample.checkNumberPhone(numPhone));
        }
    }
}
