package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class TestSquare {
    public static void main(String[] args) {
        Shape s1 = new Square(true, 5);
        Shape s2 = new Rectangle(5.0, 7.8);
        Shape s3 = new Circle(2.0);
        Shape[] array = new Shape[3];
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Square) {
                System.out.println("Area : " + ((Square) array[i]).getArea());
            }
            if (array[i] instanceof IColorable) {
                ((IColorable) array[i]).howToColor();
            }
        }
    }
}
