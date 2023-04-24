package ss17_io_binary_file.bai_tap.quan_ly_san_pham.until;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static void writeFile(String filePath, List<Product> productList,boolean append) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(filePath, append);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
