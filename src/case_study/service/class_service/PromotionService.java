package case_study.service.class_service;

import case_study.model.BookingModel;
import case_study.model.person.CustomerModel;
import case_study.service.interface_service.IPromotionService;

import java.time.Month;
import java.util.*;

public class PromotionService implements IPromotionService {
    Scanner scanner = new Scanner(System.in);
    BookingService bookingService = new BookingService();
    CustomerService customerService = new CustomerService();
    List<CustomerModel> customerList = customerService.returnList();
    TreeSet<BookingModel> bookingTreeSet = bookingService.returnBooking();
    List<CustomerModel> customerLinkedList = new LinkedList<>();

    @Override
    public void display() {
        bookingService.read();
        System.out.print("Enter date Booking (dd-MM-yyyy)");
        String dateBooking = scanner.nextLine();
        ArrayList<BookingModel> arrayList = new ArrayList<>();
        arrayList.addAll(bookingTreeSet);
        for (int i = 0; i < arrayList.size(); i++) {
            String[] arr = arrayList.get(i).getDayStart().split("-");
            if (dateBooking.equals(arr[2])) {
                for (int j = 0; j < customerList.size(); j++) {
                    if (arrayList.get(i).getCodeBooking().equals(customerList.get(j).getCode())) {
                        customerLinkedList.add(customerList.get(j));
                        break;
                    }
                }
            }
        }
        for (CustomerModel customer : customerLinkedList) {
            System.out.println(customer);
        }
    }

    @Override
    public void displayVoucher() {
        System.out.println("Quantity voucher 10%");
        int voucher10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Quantity voucher 20%");
        int voucher20 = Integer.parseInt(scanner.nextLine());
        System.out.println("Quantity voucher 50%");
        int voucher50 = Integer.parseInt(scanner.nextLine());
        Stack<BookingModel> bookingStack = new Stack<>();
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        Month currentMonth = Month.of(currentDate.getMonth());
        System.out.println("Current month: " + currentMonth.getValue());
        List<BookingModel> arrayList = new ArrayList<>();
        arrayList.addAll(bookingTreeSet);
        for (int i = 0; i < arrayList.size(); i++) {
            String[] arr = arrayList.get(i).getDayStart().split("-");
            String month = arr[1];
            if (Integer.parseInt(month) == currentMonth.getValue()) {
                bookingStack.add(arrayList.get(i));
            }
        }
        for (int i = 0; i < bookingStack.size(); i++) {
            if (voucher10 > 0) {
                System.out.println(bookingStack.get(i));
                System.out.println("Voucher10%");
                voucher10--;
            } else if (voucher20 > 0) {
                System.out.println(bookingStack.get(i));
                System.out.println("Voucher20%");
                voucher20--;
            } else if (voucher50 > 0) {
                System.out.println(bookingStack.get(i));
                System.out.println("Voucher50%");
                voucher50--;
            } else
                break;
        }
    }
}
