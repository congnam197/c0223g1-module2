package ss17_io_binary_file.bai_tap.quan_ly_san_pham.controller;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class ProductController {
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
                    "3.Tìm Kiếm Sản Phẩm\n" +
                    "0.Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.showProduct();
                    break;
                case "3":
                    productService.searchProduct();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Bạn vừa thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Không có lựa chọn");
            }
        } while (flag);
    }

}
