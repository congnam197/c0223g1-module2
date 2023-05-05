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
    ContractRepository contractRepository = new ContractRepository();
    BookingService bookingService = new BookingService();


    @Override
    public void read() {
        contractTreeSet = contractRepository.read();
    }

    @Override
    public void create() {
        TreeSet<BookingModel> bookingTreeSet = bookingService.returnBooking();
        System.out.print("Enter number contracts: ");
        int numberContract = 0;
        boolean flagNumberContract;
        do {
            try {
                numberContract = Integer.parseInt(scanner.nextLine());
                flagNumberContract = false;
            } catch (NumberFormatException e) {
                System.err.print("Incorrect format");
                flagNumberContract = true;
            }
        } while (flagNumberContract);
        System.out.println("Enter booking's code: ");
        bookingService.display();
        String codeBooking ;
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
        ContractModel contract = new ContractModel(numberContract, codeBooking, depositAmount, totalPaymentAmount);
        contractRepository.add(contract);
        System.out.println("successfully added");
    }

    @Override
    public void display() {
        read();
        for (ContractModel contract : contractTreeSet) {
            System.out.println(contract);
        }
    }

    public void edit() {
        TreeSet<BookingModel> bookingTreeSet = bookingService.returnBooking();
        List<ContractModel> contractModels = contractRepository.getContrat();
        System.out.println("Enter the number's contract");
        int numberContractedit = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < contractModels.size(); i++) {
            if (numberContractedit == contractModels.get(i).getNumberContract()) {
                System.out.println("Information's contract :" + contractModels.get(i));
                System.out.print("Enter number contracts: ");
                int numberContract = 0;
                boolean flagNumberContract;
                do {
                    try {
                        numberContract = Integer.parseInt(scanner.nextLine());
                        flagNumberContract = false;
                    } catch (NumberFormatException e) {
                        System.err.print("Incorrect format ");
                        flagNumberContract = true;
                    }
                } while (flagNumberContract);
                System.out.println("Enter booking's code: ");
                bookingService.display();
                String codeBooking;
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
                ContractModel contract = new ContractModel(numberContract, codeBooking, depositAmount, totalPaymentAmount);
                contractRepository.edit(contract, i);
                System.out.println("Edit successfully");
                check = false;
            }
        }
        if (check) {
            System.out.println("Contract does not exist!");
        }
    }
}
