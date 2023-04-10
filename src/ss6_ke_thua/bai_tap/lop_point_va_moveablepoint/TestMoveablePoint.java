package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoin1 = new MoveablePoint(4, 4);
        System.out.println(moveablePoin1.toString());
        MoveablePoint moveablePoint2 = new MoveablePoint(4, 4, 3, 3);
        System.out.println(moveablePoint2.move());
    }
}
