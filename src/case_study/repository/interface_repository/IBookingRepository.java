package case_study.repository.interface_repository;

import case_study.model.BookingModel;

import java.util.TreeSet;

public interface IBookingRepository {
    void add(BookingModel bookingModel);

    TreeSet<BookingModel> read();

    void countValue(String str);
}
