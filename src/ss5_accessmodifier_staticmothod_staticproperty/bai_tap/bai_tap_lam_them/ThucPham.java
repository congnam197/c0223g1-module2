package ss5_accessmodifier_staticmothod_staticproperty.bai_tap.bai_tap_lam_them;


import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ThucPham {
    private static int maHang;
    private String tenHang;
    private double donGia;
    private Date ngaysanXuat;
    private Date ngayHetHan;

    public ThucPham(String tenHang, double donGia, Date ngaysanXuat, Date ngayHetHan) {
        maHang++;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaysanXuat = ngaysanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public ThucPham() {
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        ThucPham.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaysanXuat() {
        return ngaysanXuat;
    }

    public void setNgaysanXuat(Date ngaysanXuat) {
        this.ngaysanXuat = ngaysanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySX = sdf.format(ngaysanXuat);
        String ngayHH = sdf.format(ngayHetHan);

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String vND = numberFormat.format(donGia);

        return "ThucPham {" +
                "mahang=' " + maHang + "'" +
                ", tenHang='" + tenHang + "'" +
                ", donGia=" + vND +
                ", ngaysanXuat='" + ngaySX + "'" +
                ", ngayHetHan='" + ngayHH + "'" +
                '}';
    }

    public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1 , day);
        this.ngaysanXuat = calendar.getTime();
    }

    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        this.ngayHetHan = calendar.getTime();
    }

    public boolean kiemTraTenHang() {
        boolean flag = false;
        if (this.tenHang == "" || this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống: ");
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean kiemTraDieuKien() {
        boolean check = false;
        if (this.getNgaysanXuat().compareTo(this.ngayHetHan) < 0) {
            check = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất");
        }
        return check;
    }

    public void kiemtraHSD() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String st = sdf.format(date);
        if (this.getNgayHetHan().compareTo(date) < 0) {
            System.out.println("Ngày hôm nay " + st + " Thực phẩm đã hết hạn");
        } else {
            System.out.println("Ngày hôm nay " + st + " Thực phẩm chưa hết hạn");
        }
    }

}
