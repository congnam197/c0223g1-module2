package case_study.repository;

import case_study.model.BookingModel;
import case_study.service.BookingService;
import case_study.until.file.write_and_read_file.ReadAndWrieFile;

import java.util.List;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static final String FILE_PATH_BOOKING = "src/case_study/until/file/file_csv/booking.csv";

    @Override
    public void add(BookingModel booking) {
        TreeSet<BookingModel> bookingTreeSet = new TreeSet<>();
        String string = booking.getInfoToCSV();
        ReadAndWrieFile.writeFile(FILE_PATH_BOOKING, string, true);
        bookingTreeSet.add(booking);
    }

    @Override
    public TreeSet<BookingModel> read() {
        TreeSet<BookingModel> bookingTreeSet = new TreeSet<>();
        List<String> stringList = ReadAndWrieFile.readFile(FILE_PATH_BOOKING);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String[] arr = stringList.get(i).split(",");
            BookingModel booking = new BookingModel(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingTreeSet.add(booking);
        }
        return bookingTreeSet;
    }

    @Override
    public void countValue(String str) {

    }
}
