package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + "The Area :" + getArea() + "\n";
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + getRadius() * percent / 100);
    }
}
