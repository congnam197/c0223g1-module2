package case_study.model;

public abstract class PersonModel {
    private final String COMMA = ",";
    private String code;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    private String identityCardNumber;
    private String numberPhone;
    private String email;

    public PersonModel() {
    }

    public PersonModel(String id, String name, String dateOfBirth, boolean gender,
                       String identityCardNumber, String numberPhone, String email) {
        this.code = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
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

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        String gender1;
        if (gender) {
            gender1 = "male";
        } else {
            gender1 = "female";
        }
        return
                "id:" + code + ", name: " + name + ", dateOfBirth: " + dateOfBirth + ", gender: " + gender1 +
                        ", identityCardNumber: " + identityCardNumber + ", numberPhone: " + numberPhone +
                        ", email: " + email + COMMA;
    }

    public String showList() {
        return code + COMMA + name + COMMA + dateOfBirth + COMMA + gender + COMMA +
                identityCardNumber + COMMA + numberPhone + COMMA + email + COMMA;
    }
}

