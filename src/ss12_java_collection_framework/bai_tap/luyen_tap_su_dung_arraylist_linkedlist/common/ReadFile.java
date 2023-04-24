package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.common;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ReadFile {
    public static List<Product> readFile(String filePath) {
        List<Product> productList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            Product product;
            String[] arr;
            while ((temp = bufferedReader.readLine()) != null) {
                arr = temp.split(",");
                product = new Product(parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
                productList.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
}
