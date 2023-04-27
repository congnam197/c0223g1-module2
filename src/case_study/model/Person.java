package case_study.model;

public abstract class Person {
    private final String COMMA = ",";
    private String code;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    private String identitCardNumber;
    private String numberPhone;
    private String email;


    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, boolean gender,
                  String identitCardNumber, String numberPhone, String email) {
        this.code = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identitCardNumber = identitCardNumber;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentitCardNumber() {
        return identitCardNumber;
    }

    public void setIdentitCardNumber(String identitCardNumber) {
        this.identitCardNumber = identitCardNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return
                "idCustomer :" + code +
                        ", nameCustomer: " + name +
                        ", dateOfBirth: " + dateOfBirth +
                        ", identitCardNumber: " + identitCardNumber +
                        ", numberPhone: " + numberPhone + COMMA;
    }

    public String showList() {
        return code + COMMA + name + COMMA + dateOfBirth + COMMA + gender + COMMA +
                identitCardNumber + COMMA + numberPhone + COMMA + email + COMMA;
    }
}

