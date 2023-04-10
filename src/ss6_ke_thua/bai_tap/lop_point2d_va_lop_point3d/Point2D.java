package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D (" +
                +x + ","
                + y +
                ')';
    }
}
