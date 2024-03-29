package case_study.model.person;

import case_study.repository.class_repository.PersonModel;

public class EmployeeModel extends PersonModel {
    private String level;
    private String position;
    private double salary;

    public EmployeeModel() {
    }

    public EmployeeModel(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public EmployeeModel(String id, String name, String dateOfBirth, boolean gender, String identitCardNumber, String numberPhone, String email, String level, String position, double salary) {
        super(id, name, dateOfBirth, gender, identitCardNumber, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                super.toString() +
                " level: " + level +
                ", position: " + position +
                ", salary: " + salary;
    }

    public String getInfoToCSV() {
        return super.showList() + level + "," + position + "," + salary;
    }
}
