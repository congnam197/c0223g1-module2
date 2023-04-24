package ss17_io_binary_file.bai_tap.quan_ly_san_pham.repository;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham.model.Product;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.until.ReadFile;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham.until.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE_NAME = "src/ss17_io_binary_file/bai_tap/quan_ly_san_pham/until/product.csv";

    @Override
    public List<Product> showProduct() {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        if (productList.size() == 0) {
            productList.add(product);
            WriteFile.writeFile(FILE_NAME, productList, true);
        } else {
            productList.add(product);
            WriteFile.writeFile(FILE_NAME, productList, false);
        }
    }

    @Override
    public boolean searchProduct(String name) {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getNameProduct())) {
                System.out.println(productList.get(i));
                return true;
            }
        }
        return false;
    }
}
