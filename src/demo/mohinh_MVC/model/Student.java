package demo.mohinh_MVC.model;

public class Student {
    private String codeStudent;
    private String nameStudent;
    private String classStudent;
    private boolean gender;
    private int numberPhoneStudent;

    public Student() {
    }

    public Student(String codeStudent, String nameStudent, String classStudent, boolean gender, int numberPhoneStudent) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.classStudent = classStudent;
        this.gender = gender;
        this.numberPhoneStudent = numberPhoneStudent;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getNumberPhoneStudent() {
        return numberPhoneStudent;
    }

    public void setNumberPhoneStudent(int numberPhoneStudent) {
        this.numberPhoneStudent = numberPhoneStudent;
    }

    @Override
    public String toString() {
        String gender1;
        if (gender==false){
            gender1="Nữ";
        }else gender1="Nam";
        return "Student{" +
                "codeStudent='" + codeStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", classStudent='" + classStudent + '\'' +
                ", gender=" + gender1 +
                ", numberPhoneStudent=" + numberPhoneStudent +
                '}';
    }

    public String getToFileCSV() {
        return codeStudent + "," + nameStudent + "," + classStudent + "," + gender + "," + numberPhoneStudent;
    }
}
