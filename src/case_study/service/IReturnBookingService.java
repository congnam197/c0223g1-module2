package case_study.service;

import case_study.model.BookingModel;

import java.util.TreeSet;

public interface IReturnBookingService {
    TreeSet<BookingModel> returnBooking();
}
