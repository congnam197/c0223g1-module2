package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import java.util.Arrays;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(3.2, 5.8);
        shapes[2] = new Square(4);
        System.out.println("Trước khi thay đổi");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random() * 100);
        }
        System.out.println("Sau khi thay đổi");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
