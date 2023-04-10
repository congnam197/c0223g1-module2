package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setLength(double length){
        setSide(length);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
