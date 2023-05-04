package case_study.service;

import case_study.model.BookingModel;
import case_study.model.CustomerModel;
import case_study.model.FacilityModel;
import case_study.repository.BookingRepository;
import case_study.until.file.regex.Regex;

import java.util.*;

public class BookingService implements IBookingService, IReturnBookingService {
    Scanner scanner = new Scanner(System.in);
    TreeSet<BookingModel> bookingTreeSet = new TreeSet<>();
    BookingRepository bookingRepository = new BookingRepository();
    FacilityService facilityService = new FacilityService();
    Map<FacilityModel, Integer> facilityIntegerMap = facilityService.returnMap();
    CustomerService customerService = new CustomerService();
    List<CustomerModel> customerList = customerService.returnList();

    @Override
    public void add() {
        System.out.println("Enter the code client (KH-XXXX)  ");
        customerService.display();
        String codeClient;
        boolean flag = true;
        do {
            codeClient = scanner.nextLine();
            for (CustomerModel customerModel : customerList) {
                if (codeClient.equals(customerModel.getCode())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print("You entered it wrong, please re-enter  ");
            }
        } while (flag);
        System.out.println("Enter the code service  ");
        facilityService.display();
        String idService;
        boolean flag1 = true;
        do {
            idService = scanner.nextLine();
            Set<FacilityModel> facilitySet = facilityIntegerMap.keySet();
            for (FacilityModel x : facilitySet) {
                if (idService.equals(x.getServiceId())) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1) {
                System.out.print("You entered it wrong, please re-enter  ");
            }
        } while (flag1);
        System.out.print("Code booking  ");
        String codeBooking;
        boolean flag2;
        do {
            flag2 = false;
            codeBooking = scanner.nextLine();
            for (BookingModel booking : bookingTreeSet) {
                if (codeBooking.equals(booking.getCodeBooking())) {
                    flag2 = true;
                    System.out.print("You entered it wrong, please re-enter  ");
                }
            }
        } while (flag2);
        System.out.print("Date Booking  ");
        String dateBooking;
        boolean flag3;
        do {
            dateBooking = scanner.nextLine();
            if (Regex.checkDay(dateBooking)) {
                if (Regex.checkDayBooking(dateBooking)) {
                    flag3 = false;
                } else {
                    System.out.print("You enter it wrong, please check again\n" +
                            "The Booking date can't be after the current date  ");
                    flag3 = true;
                }
            } else {
                System.out.print("You enter it wrong, please re-enter  ");
                flag3 = true;
            }
        } while (flag3);
        System.out.print("Day start ");
        String dayStart;
        boolean flag4;
        do {
            dayStart = scanner.nextLine();
            if (Regex.checkDay(dayStart)) {
                if (Regex.checkDayStartAndDayEnd(dateBooking, dayStart)) {
                    flag4 = false;
                } else {
                    System.out.print("You enter it wrong, please check again\n" +
                            "The Start date can't before the booking date  ");
                    flag4 = true;
                }
            } else {
                System.out.print("You entered it wrong, please re-enter  ");
                flag4 = true;
            }
        } while (flag4);
        System.out.print("Day end ");
        String dayEnd;
        boolean flag5 = true;
        do {
            dayEnd = scanner.nextLine();
            if (Regex.checkDay(dayEnd)) {
                if (Regex.checkDayStartAndDayEnd(dayStart, dayEnd)) {
                    flag5 = false;
                } else {
                    System.out.print("You enter it wrong, please check again\n" +
                            "The End date can't before the Start date ");
                }
            } else {
                System.out.print("You entered it wrong, please re-enter ");
            }
        } while (flag5);
        BookingModel booking = new BookingModel(codeClient, idService, codeBooking, dateBooking, dayStart, dayEnd);
        bookingRepository.add(booking);
        bookingRepository.countValue(idService);
        System.out.println("successfully added new");
    }

    @Override
    public void display() {
        read();
        System.out.println(bookingTreeSet);
    }

    @Override
    public TreeSet<BookingModel> returnBooking() {
        read();
        return bookingTreeSet;
    }

    @Override
    public void read() {
        bookingTreeSet = bookingRepository.read();
    }
}
