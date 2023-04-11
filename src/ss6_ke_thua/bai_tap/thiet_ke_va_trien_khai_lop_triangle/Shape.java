package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + color + ", " + (filled ? "filled" : "unfilled");
    }
}
