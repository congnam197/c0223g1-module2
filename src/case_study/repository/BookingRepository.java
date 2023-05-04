package case_study.repository;

import case_study.model.BookingModel;
import case_study.model.HouseModel;
import case_study.model.RoomModel;
import case_study.model.VillaModel;
import case_study.until.file.regex.Regex;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static final String FILE_PATH_BOOKING = "src/case_study/until/file/file_csv/booking.csv";
    private static final String FILE_HOUSE = "src/case_study/until/file/file_csv/house.csv";
    private static final String FILE_ROOM = "src/case_study/until/file/file_csv/room.csv";
    private static final String FILE_VILLA = "src/case_study/until/file/file_csv/villa.csv";
    TreeSet<BookingModel> bookingTreeSet = new TreeSet<>();

    @Override
    public void add(BookingModel booking) {
        String string = booking.getInfoToCSV();
        ReadAndWriteFile.writeFile(FILE_PATH_BOOKING, string, true);
        bookingTreeSet.add(booking);
    }

    @Override
    public TreeSet<BookingModel> read() {
        List<String> stringList = ReadAndWriteFile.readFile(FILE_PATH_BOOKING);
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
        List<String> stringList = new ArrayList<>();
        String string = "";
        if (Regex.checkIdHouse(str)) {
            stringList = ReadAndWriteFile.readFile(FILE_HOUSE);
            for (int i = 0; i < stringList.size(); i++) {
                String[] arr = stringList.get(i).split(",");
                if (arr[0].equals(str)) {
                    HouseModel house = new HouseModel(arr[0], arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
                    int value = Integer.parseInt(arr[8]) + 1;
                    string = house.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWriteFile.writeFile(FILE_HOUSE, string, false);
                    } else {
                        ReadAndWriteFile.writeFile(FILE_HOUSE, string, true);
                    }
                } else {
                    HouseModel house = new HouseModel(arr[0], arr[1], Double.parseDouble(arr[2]),
                            Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
                    int value = Integer.parseInt(arr[8]);
                    string = house.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWriteFile.writeFile(FILE_HOUSE, string, false);
                    } else {
                        ReadAndWriteFile.writeFile(FILE_HOUSE, string, true);
                    }
                }
            }

        } else if (Regex.checkIdVilaa(str)) {
            stringList = ReadAndWriteFile.readFile(FILE_VILLA);
            for (int i = 0; i < stringList.size(); i++) {
                String[] arr = stringList.get(i).split(",");
                if (arr[0].equals(str)) {
                    VillaModel villa = new VillaModel(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                            Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                    int value = Integer.parseInt(arr[9]) + 1;
                    string = villa.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWriteFile.writeFile(FILE_VILLA, string, false);
                    } else {
                        ReadAndWriteFile.writeFile(FILE_VILLA, string, true);
                    }
                } else {
                    VillaModel villa = new VillaModel(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                            Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                    int value = Integer.parseInt(arr[9]);
                    string = villa.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWriteFile.writeFile(FILE_VILLA, string, false);
                    } else {
                        ReadAndWriteFile.writeFile(FILE_VILLA, string, true);
                    }
                }
            }
        } else {
            stringList = ReadAndWriteFile.readFile(FILE_ROOM);
            for (int i = 0; i < stringList.size(); i++) {
                String[] arr = stringList.get(i).split(",");
                if (arr[0].equals(str)) {
                    RoomModel room = new RoomModel(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                            Integer.parseInt(arr[4]), arr[5], arr[6]);
                    int value = Integer.parseInt(arr[7]) + 1;
                    string = room.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWriteFile.writeFile(FILE_ROOM, string, false);
                    } else {
                        ReadAndWriteFile.writeFile(FILE_ROOM, string, true);
                    }
                } else {
                    RoomModel room = new RoomModel(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3])
                            , Integer.parseInt(arr[4]), arr[5], arr[6]);
                    int value = Integer.parseInt(arr[7]);
                    string = room.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWriteFile.writeFile(FILE_ROOM, string, false);
                    } else {
                        ReadAndWriteFile.writeFile(FILE_ROOM, string, true);
                    }
                }
            }
        }
    }
}

