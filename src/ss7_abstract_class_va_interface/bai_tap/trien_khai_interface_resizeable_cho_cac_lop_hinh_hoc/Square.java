package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements IResizeable {
    private double side = 1.0;

    public Square(double side) {
        this.side = side;
    }

    public Square() {

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide() +
                "The Area :" + this.getArea() + "\n";
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);

    }

}
