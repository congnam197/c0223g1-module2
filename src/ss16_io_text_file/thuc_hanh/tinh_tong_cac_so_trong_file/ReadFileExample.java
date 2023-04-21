package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_trong_file;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng :" + sum);
        } catch (Exception e) {
            System.out.println("FIle không tồn tại hoặc có lỗi");
        }
    }
}
