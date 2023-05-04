package case_study.service;

import case_study.model.BookingModel;
import case_study.model.ContractModel;
import case_study.model.CustomerModel;
import case_study.repository.ContractRepository;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ContractService implements IContractService, IDisplayService {
    Scanner scanner = new Scanner(System.in);
    TreeSet<ContractModel> contractTreeSet = new TreeSet<>();
    CustomerService customerService = new CustomerService();
    ContractRepository contractRepository = new ContractRepository();
    List<CustomerModel> customerList = customerService.returnList();
    BookingService bookingService = new BookingService();


    @Override
    public void read() {
        contractTreeSet = contractRepository.read();
    }



    @Override
    public void create() {
        TreeSet<BookingModel> bookingTreeSet = bookingService.bookingTreeSet;
        System.out.print("Enter number contracts: ");
        int numberContract = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter booking's code: ");
        String codeBooking = "";
        boolean flag = true;
        do {
            codeBooking = scanner.nextLine();
            for (BookingModel booking : bookingTreeSet) {
                if (codeBooking.equals(booking.getCodeBooking())) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print("You entered it wrong, please re-enter: ");
            }
        } while (flag);
        System.out.print("Enter the deposit amount: ");
        int depositAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("Total payment amount: ");
        int totalPaymentAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("Client's code: ");
        String codeClient = "";
        boolean flag1 = true;
        do {
            codeClient = scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (codeClient.equals(customerList.get(i).getCode())) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1) {
                System.out.print("You entered it wrong, please re-enter: ");
            }
        } while (flag1);
        ContractModel contract = new ContractModel(numberContract, codeBooking, depositAmount, totalPaymentAmount, codeClient);
        contractRepository.add(contract);
        System.out.println("successfully added");
    }

    @Override
    public void display() {
        read();
        System.out.println(contractTreeSet);
    }

    public void edit() {

    }
}
