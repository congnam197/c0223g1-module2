package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Triangle extends Shape {
    double side1 = 1.0,
            side2 = 1.0,
            side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return Double.sum(side1, Double.sum(side2, side3));
    }

    @Override
    public String toString() {
        return "A Triagle with side: " + side1 + ", " + side2 + ", " + side3 + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }

}
