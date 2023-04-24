package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.service;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.common.WriteFile;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory.IProductRepossitory;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory.ProductRepossitory;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final String FILE_NAME = "src/ss12_java_collection_framework/bai_tap/luyen_tap_su_dung_arraylist_linkedlist/product.csv";
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
        WriteFile.writeFile(FILE_NAME, newProduct.getFile(), true);
        System.out.println("Thêm sản phẩm thành công");
    }

    @Override
    public void editProductById() {
        this.displayProduct();
        System.out.println("Nhập id sản phẩm cần sửa:");
        int id = Integer.parseInt(sc.nextLine());
        int checkId = productRepossitory.findId(id);
        if (checkId == -1) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            System.out.println("Nhập lại id sản phẩm: ");
            int idEdit = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập lại tên sản phẩm:");
            String nameEdit = sc.nextLine();
            System.out.println("nhập lại giá sản phẩm: ");
            double priceEdit = sc.nextDouble();
            Product product = new Product(idEdit, nameEdit, priceEdit);
            productRepossitory.editProductById(product, checkId);
            System.out.println("Đã sửa thành công");
            displayProduct();
        }
    }

    @Override
    public void displayProduct() {
        List<Product> productList = productRepossitory.getProductList();
        for (Product product : productList) {
            System.out.println(product.getFile());
        }
    }

    @Override
    public void deleteProductById() {
        this.displayProduct();
        System.out.println("Nhập id sản phẩm cẩn xóa");
        int id = Integer.parseInt(sc.nextLine());
        boolean checkId = productRepossitory.deleteProductById(id);
        if (checkId) {
            System.out.println("Đã xóa thành công");
            displayProduct();
        } else {
            System.out.println("Không tìm thấy");
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
        displayProduct();
    }
}
