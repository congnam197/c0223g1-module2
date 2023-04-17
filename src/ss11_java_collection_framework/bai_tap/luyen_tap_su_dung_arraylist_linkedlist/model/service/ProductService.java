package ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.service;

import ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;
import ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory.IProductRepossitory;
import ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory.ProductRepossitory;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepossitory productRepossitory = new ProductRepossitory();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập id sản phẩm:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        double priceProduct = sc.nextDouble();
        Product newProduct = new Product(id, nameProduct, priceProduct);
        productRepossitory.addNewProduct(newProduct);
    }

    @Override
    public void editProductById() {
        this.displayProduc();
        System.out.println("Nhập id sản phẩm cần sửa:");
        int id = Integer.parseInt(sc.nextLine());
        boolean editProduct = productRepossitory.deleteProductById(id);
        if (editProduct) {
            for (int i = 0; i < productRepossitory.getProductList().size(); i++) {
                if (id == productRepossitory.getProductList().get(i).getId()) {
                    System.out.println("Nhập lại id sản phẩm: ");
                    int idEdit = Integer.parseInt(sc.nextLine());
                    productRepossitory.getProductList().get(i).setId(idEdit);
                    System.out.println("Nhập lại tên sản phẩm:");
                    String nameEdit = sc.nextLine();
                    productRepossitory.getProductList().get(i).setNameProduct(nameEdit);
                    System.out.println("nhập lại giá sản phẩm: ");
                    double priceEdit = sc.nextDouble();
                    productRepossitory.getProductList().get(i).setPriceProduct(priceEdit);
                    displayProduc();
                    break;
                } else {
                    System.out.println("Không tìm thấy sản phẩm");
                }
            }
        }
    }

    @Override
    public void displayProduc() {
        List<Product> productList = productRepossitory.getProductList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void deleteProductById() {
        this.displayProduc();
        System.out.println("Nhập id sản phẩm cẩn xóa");
        int id = Integer.parseInt(sc.nextLine());
        boolean deleteProduct = productRepossitory.deleteProductById(id);
        if (deleteProduct) {
            for (int i = 0; i < productRepossitory.getProductList().size(); i++) {
                if (id == productRepossitory.getProductList().get(i).getId()) {
                    productRepossitory.getProductList().remove(i);
                    System.out.println("Đã xóa thành công");
                    break;
                } else {
                    System.out.println("Không tìm thấy sản phẩm");
                }
            }
        } else {
            System.out.println("Bạn không chọn xóa");
        }
    }

    @Override
    public void searchProductByNameProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String nameProduct = sc.nextLine();
        boolean searchProduct = productRepossitory.searchProductByNameProduct(nameProduct);
        if (searchProduct) {
            for (int i = 0; i < productRepossitory.getProductList().size(); i++) {
                if (productRepossitory.getProductList().get(i).getNameProduct().equals(nameProduct))
                    System.out.println(productRepossitory.getProductList().get(i));
            }
        } else {
            System.out.println("Không tìm thấy  sản phẩm");
        }
    }

    @Override
    public void sortProduct() {
        productRepossitory.getProductList().sort(Comparator.comparing(Product::getPriceProduct));
        displayProduc();
    }
}
