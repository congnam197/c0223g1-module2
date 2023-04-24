package ss17_io_binary_file.bai_tap.copy_file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    private static final String FILE_SOURCE = "src/ss17_io_binary_file/bai_tap/copy_file/file/source.txt";
    private static final String FILE_TARGET = "src/ss17_io_binary_file/bai_tap/copy_file/file/target.txt";

    public static void main(String[] args) throws IOException {
        String str = CoppyFile.readFile(FILE_SOURCE);
        CoppyFile.writeFile(FILE_TARGET, str);
        int count = CoppyFile.counter(FILE_TARGET);
        System.out.println(" số byte có trong file :" + count);
    }
}
