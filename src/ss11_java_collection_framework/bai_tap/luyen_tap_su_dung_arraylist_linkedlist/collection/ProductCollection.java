package ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.collection;

import ss11_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.service.ProductService;

import java.util.Scanner;

public class ProductCollection {
    Scanner sc = new Scanner(System.in);
    ProductService productService = new ProductService();
    public void productManager() {
        System.out.println("---Quản lý  sản phẩm----");
        System.out.println("-------------------------");
        boolean flag = true;
        do {
            System.out.println("Nhập lựa chọn của bạn \n" +
                    "1.Thêm Sản Phẩm \n" +
                    "2.Hiện thị danh sách sản phẩm \n" +
                    "3.Sửa thông tin sản phẩm \n" +
                    "4.Xóa sản phẩm \n" +
                    "5.Tìm Kiếm Sản Phẩm\n" +
                    "6.Sắp xếp sản phẩm theo giá \n" +
                    "7.Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.displayProduc();
                    break;
                case "3":
                    productService.editProductById();
                    break;
                case "4":
                    productService.deleteProductById();
                    break;
                case "5":
                    productService.searchProductByNameProduct();
                    break;
                case "6":
                    productService.sortProduct();
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

}
