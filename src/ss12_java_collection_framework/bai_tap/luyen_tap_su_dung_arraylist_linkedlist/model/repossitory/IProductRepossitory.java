package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.util.List;

public interface IProductRepossitory {
    List<Product> getProductList();

    void addNewProduct(Product product);

    void editProductById(Product product, int index);

    boolean deleteProductById(int id);

    boolean searchProductByNameProduct(String name);

    void sortProduct();

    int findId(int id);
}
