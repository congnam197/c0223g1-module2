package ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    static List<Product> list = new ArrayList<>();

    static {
        Product product1 = new Product(1, "SamSung", 12000);
        Product product2 = new Product(2, "Apple", 20000);
        Product product3 = new Product(3, "NoKia", 700);
        Product product4 = new Product(4, "Xiaomi", 1000);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
    }

    public void productManager() {
        System.out.println("---Quản lý  sản phẩm----");
        System.out.println("-------------------------");
        boolean flag = true;
        do {
            System.out.println("Nhập lựa chọn của bạn \n" +
                    "1.Thêm Sản Phẩm \n" +
                    "2.Hiện thị danh sách sản phẩm \n" +
                    "3.Sủa thông tin sản phẩm \n" +
                    "4.Xóa sản phẩm \n" +
                    "5.Tìm Kiếm Sản Phẩm\n" +
                    "6.Sắp xếp sản phẩm theo giá \n" +
                    "7.Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    displayProduc();
                    break;
                case "3":
                    editProductById();
                    break;
                case "4":
                    deleteProuctById();
                    break;
                case "5":
                    searchProductByNameProduct();
                    break;
                case "6":
//                    sortProductByPrice();
                    break;
                case "7":
                    flag = false;
                    System.out.println("Bạn vừa thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Không có lựa chọn");
            }
        } while (flag);
    }

    public void addProduct() {
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập id sản phẩm:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        double priceProduct = sc.nextDouble();
        Product product = new Product(id, nameProduct, priceProduct);
        list.add(product);
    }

    public void editProductById() {
        System.out.println("Nhập id sản phẩm cần sửa:");
        int idProduct = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (idProduct == list.get(i).getId()) {
                System.out.println("Nhập lại id sản phẩm: ");
                int idEdit = Integer.parseInt(sc.nextLine());
                list.get(i).setId(idEdit);
                System.out.println("Nhập lại tên sản phẩm:");
                String nameEdit = sc.nextLine();
                list.get(i).setNameProduct(nameEdit);
                System.out.println("nhập lại giá sản phẩm: ");
                double priceEdit = sc.nextDouble();
                list.get(i).setPriceProduct(priceEdit);
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm:");
            }
        }
    }

    public void displayProduc() {
        for (Product productList : list) {
            System.out.println(productList);
        }
    }

    public void deleteProuctById() {
        System.out.println("Nhập id sản phẩm cẩn xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                System.out.println("Đã xóa thành công!");
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm");
            }
        }
    }

    public void searchProductByNameProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String nameProduct = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().equals(nameProduct)) {
                System.out.println(list.get(i));
                break;
            } else {
                System.out.println("Không tìm thấy  sản phẩm");
                break;
            }
        }
    }

//    public void sortProductByPrice() {
//        List<Double> priceProduct = new ArrayList<Product>()
//        for (int i = 0; i < list.size(); i++) {
//            priceProduct.
//        }
//        for (Product product : list) {
//            System.out.println(product);
//        }
//    }
}

