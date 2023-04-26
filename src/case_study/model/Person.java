package case_study.model;

public abstract class Person {
    private final String COMMA = ",";
    private String code;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int identitCardNumber;
    private int numberPhone;
    private String email;


    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender,
                  int identitCardNumber, int numberPhone, String email) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentitCardNumber() {
        return identitCardNumber;
    }

    public void setIdentitCardNumber(int identitCardNumber) {
        this.identitCardNumber = identitCardNumber;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "{" +
                "idCustomer='" + code + '\'' +
                ", nameCustomer='" + name + '\'' +
                ", ageCustomer=" + dateOfBirth +
                ", identitCardNumber='" + identitCardNumber + '\'' +
                ", numberPhone='" + numberPhone + '\'' + ",";
    }

    public String showList() {
        return code + COMMA + name + COMMA + dateOfBirth + COMMA + gender + COMMA +
                identitCardNumber + COMMA + numberPhone + COMMA + email + COMMA;
    }
}

