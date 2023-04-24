package ss17_io_binary_file.bai_tap.quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 6433858223774886977L;
    private int code;
    private String nameProduct;
    private double priceProduct;
    private String brand;
    private String review;

    public Product() {
    }

    public Product(int code, String nameProduct, double priceProduct, String brand, String review) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.brand = brand;
        this.review = review;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Product [" +
                "code=" + code +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", brand='" + brand + '\'' +
                ", review='" + review + '\'' +
                ']';
    }
}
