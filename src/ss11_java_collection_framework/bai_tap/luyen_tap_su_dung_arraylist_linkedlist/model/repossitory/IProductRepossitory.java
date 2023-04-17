package ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory;

import ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.util.List;

public interface IProductRepossitory {
    List<Product> getProductList();

    void addNewProduct(Product product);

    boolean editProductById(int id);

    boolean deleteProductById(int id);

    boolean searchProductByNameProduct(String name);

    void sortProduct();
}
