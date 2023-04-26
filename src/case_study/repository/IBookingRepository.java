package case_study.repository;

import case_study.model.Booking;

import java.util.TreeSet;

public interface IBookingRepository {
    void add(Booking booking);

    TreeSet<Booking> read();

    void countValue(String str);
}
