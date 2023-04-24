package ss17_io_binary_file.bai_tap.quan_ly_san_pham.service;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.model.Product;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.repository.IProductRepository;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.repository.ProductRepository;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.until.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final String FILE_NAME = "src/ss17_io_binary_file/bai_tap/quan_ly_san_pham/until/product.csv";
    List<Product>list=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    IProductRepository productRepository = new ProductRepository();

    @Override
    public void showProduct() {
        List<Product> productList =productRepository.showProduct();
        for (Product s:productList) {
            System.out.println(s);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhap ma san pham");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Hang san xuat");
        String brand = scanner.nextLine();
        System.out.println("Nhap mo ta");
        String review = scanner.nextLine();
        Product product = new Product(code, name, price, brand, review);
        productRepository.addProduct(product);
        System.out.println("Da them thanh cong");
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhap ten san pham");
        String name= scanner.nextLine();
        boolean check= productRepository.searchProduct(name);
        if (check==true){
            System.out.println("Da tim thay");
        }else {
            System.out.println("Khong tim thay");
        }
    }
}
