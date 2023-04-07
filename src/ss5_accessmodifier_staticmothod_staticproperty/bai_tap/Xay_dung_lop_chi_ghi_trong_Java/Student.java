package ss5_accessmodifier_staticmothod_staticproperty.bai_tap.Xay_dung_lop_chi_ghi_trong_Java;

public class Student {
    private String name="John";
    private static String classes ="C02";
    Student(){
    }

     void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name=' " + name + '\'' +
                ", classes=' " + classes + '\'' +
                '}';
    }
}
