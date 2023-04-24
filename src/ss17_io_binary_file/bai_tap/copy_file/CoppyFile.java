package ss17_io_binary_file.bai_tap.copy_file;

import java.io.*;

public class CoppyFile {
    static final long serialVersionUID = 4L;

    public static void writeFile(String filePath, String str) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static String readFile(String filePath) {
        String str = "";
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            byte[] bytes = new byte[10];
            int i = -1;
            while ((i = is.read(bytes)) != -1) {
                str = new String(bytes, 0, i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static int counter(String file) {
        int count = file.length();
        return count;
    }
}
