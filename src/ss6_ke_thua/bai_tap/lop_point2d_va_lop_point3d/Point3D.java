package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D (" + getX() + "," + getY() + "," + z + ")";
    }
}
