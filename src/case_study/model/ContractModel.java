package case_study.model;

public class ContractModel {
    private int numberContract;
    private String codeBooking;
    private int advanceDepositAmount;
    private int totalPaymentAmount;
    private String codeClient;

    public ContractModel() {
    }

    public ContractModel(int numberContract, String codeBooking, int advanceDepositAmount, int totalPaymentAmount, String codeClient) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.codeClient = codeClient;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(int advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "numberContract: " + numberContract +
                ", codeBooking: " + codeBooking +
                ", advanceDepositAmount: " + advanceDepositAmount +
                ", totalPaymentAmount: " + totalPaymentAmount +
                ", codeClient: " + codeClient;
    }

    public String getInfoToCSV() {
        return numberContract + "," + codeBooking + "," + advanceDepositAmount + "," + totalPaymentAmount + "," + codeClient;
    }
}
