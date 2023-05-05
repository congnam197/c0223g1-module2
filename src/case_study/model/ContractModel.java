package case_study.model;

public class ContractModel implements Comparable<ContractModel> {
    private int numberContract;
    private String codeBooking;
    private int depositAmount;
    private int totalPaymentAmount;

    public ContractModel() {
    }

    public ContractModel(int numberContract, String codeBooking, int depositAmount, int totalPaymentAmount) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.depositAmount = depositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
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

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "numberContract: " + numberContract +
                ", codeBooking: " + codeBooking +
                ", advanceDepositAmount: " + depositAmount +
                ", totalPaymentAmount: " + totalPaymentAmount;

    }

    public String getInfoToCSV() {
        return numberContract + "," + codeBooking + "," + depositAmount + "," + totalPaymentAmount;
    }

    @Override
    public int compareTo(ContractModel o) {
        return this.numberContract - (o.numberContract);
    }
}
