package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.repossitory;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepossitory implements IProductRepossitory {
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
    }


    @Override
    public List<Product> getProductList() {
        return listProduct;
    }

    @Override
    public void addNewProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public boolean editProductById(int id) {
        boolean flag = true;
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                flag = false;
            } else flag = true;
        }
        return flag;
    }

    @Override
    public boolean deleteProductById(int id) {
        boolean flag = true;
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                flag = false;
            } else flag = true;
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
}
