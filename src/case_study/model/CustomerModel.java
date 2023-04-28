package case_study.model;

public class CustomerModel extends PersonModel {
    private String typeOfGuest;
    private String address;

    public CustomerModel() {
    }

    public CustomerModel(String id, String name, String dateOfBirth, boolean gender, String identitCardNumber, String numberPhone, String email, String typeCustomer, String address) {
        super(id, name, dateOfBirth, gender, identitCardNumber, numberPhone, email);
        this.typeOfGuest = typeCustomer;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer : " +
                super.toString() +
                ", typeCustomer: " + typeOfGuest +
                ", address :" + address;
    }

    public String getInfoToCSV() {
        return super.showList() + typeOfGuest + "," + address;
    }

}
