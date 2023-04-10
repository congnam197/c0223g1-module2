package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
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

    public double getPrimeter() {
        return this.radius * 2 * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", which a subclass of "
                + super.toString();
    }
}
