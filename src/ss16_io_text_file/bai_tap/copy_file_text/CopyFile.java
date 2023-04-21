package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static String readFile(String filePath) {
        String str = "";
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        {
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    str += line + "\n";
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println("Lỗi gì đó");
            } finally {
                try {
                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return str;
    }

    public static void writeFile(String filePath, String string) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int countChar(String filePath, String string) {
        int count = 0;
        string = readFile(filePath);
        for (int i = 0; i < string.length(); i++) {
            if ((Character) string.charAt(i) != null) {
                count++;
            }
        }
        return count;
    }
}
