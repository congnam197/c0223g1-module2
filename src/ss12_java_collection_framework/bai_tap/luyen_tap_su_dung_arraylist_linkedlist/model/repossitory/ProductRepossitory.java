package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory;

import ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.common.ReadAndWriteFile;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.common.ReadFile;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.common.WriteFile;
import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepossitory implements IProductRepossitory {
    private static final String FILE_NAME = "src/ss12_java_collection_framework/bai_tap/luyen_tap_su_dung_arraylist_linkedlist/product.csv";
    static List<Product> listProduct = new ArrayList<>();

    static {
        Product product1 = new Product(1, "SamSung", 12000);
        Product product2 = new Product(2, "Apple", 20000);
        Product product3 = new Product(3, "NoKia", 700);
        Product product4 = new Product(4, "Xiaomi", 1000);
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        for (Product s : listProduct) {
            WriteFile.writeFile(FILE_NAME, s.getFile(), true);
        }
    }

    @Override
    public List<Product> getProductList() {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        WriteFile.writeFile(FILE_NAME, product.getFile(), true);
    }

    @Override
    public void editProductById(Product product, int index) {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        productList.set(index, product);
        for (int i = 0; i < productList.size(); i++) {
            if (i == 0) {
                WriteFile.writeFile(FILE_NAME, productList.get(i).getFile(), false);
            } else {
                WriteFile.writeFile(FILE_NAME, productList.get(i).getFile(), true);
            }
        }
    }

    @Override
    public boolean deleteProductById(int id) {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public boolean searchProductByNameProduct(String name) {
        boolean flag = true;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getNameProduct().equals(name)) {
                flag = false;
            } else flag = true;
        }
        return flag;
    }

    @Override
    public void sortProduct() {
    }

    @Override
    public int findId(int id) {
        List<Product> productList = ReadFile.readFile(FILE_NAME);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
