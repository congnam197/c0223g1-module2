package ss4_lop_va_doi_tuong.bai_tap.xay_dung_lop_fan;

class FanManagement {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);


        Fan fan2 = new Fan();
        fan2.getSpeed();
        fan2.getRadius();
        fan2.getColor();
        fan2.isOn();
        System.out.println("Fan is on " + fan1.toString());
        System.out.println("Fan is off " + fan2.toString());

    }
}
