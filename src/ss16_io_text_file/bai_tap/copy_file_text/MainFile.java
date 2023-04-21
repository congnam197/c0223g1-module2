package ss16_io_text_file.bai_tap.copy_file_text;

public class MainFile {
    private static final String FILE_NAME_SOURCE = "src/ss16_io_text_file/bai_tap/copy_file_text/source.txt";
    private static final String FILE_NAME_RESULT = "src/ss16_io_text_file/bai_tap/copy_file_text/result_file.txt";

    public static void main(String[] args) {
        String string = "";
        string = CopyFile.readFile(FILE_NAME_SOURCE);
        CopyFile.writeFile(FILE_NAME_RESULT, string);
        int count = CopyFile.countChar(FILE_NAME_RESULT, string);
        System.out.println("Số kí tự có trong file là : " + count);
    }
}
