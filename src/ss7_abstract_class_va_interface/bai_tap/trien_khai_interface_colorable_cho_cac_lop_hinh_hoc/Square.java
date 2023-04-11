package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square implements Colorable {
    boolean colorable = false;
    double side;

    Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean colorable, double side) {
        this.colorable = colorable;
        this.side = side;
    }

    @Override
    public void howToColor() {
        if (colorable)
            System.out.println("Color all four side!");
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "This Square's area is : " + getArea();
    }
}
