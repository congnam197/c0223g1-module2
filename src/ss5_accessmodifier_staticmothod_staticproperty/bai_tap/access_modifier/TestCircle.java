package ss5_accessmodifier_staticmothod_staticproperty.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        circle.getArea();
//        circle.getRadius();
        System.out.println(circle.toString());
    }
}
