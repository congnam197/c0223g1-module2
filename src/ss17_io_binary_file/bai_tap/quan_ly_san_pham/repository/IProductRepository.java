package ss17_io_binary_file.bai_tap.quan_ly_san_pham.repository;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showProduct();

    void addProduct(Product product);

    boolean searchProduct(String name);
}
