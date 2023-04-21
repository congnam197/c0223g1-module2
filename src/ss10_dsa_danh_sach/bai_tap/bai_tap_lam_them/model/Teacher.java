package ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model;

public class Teacher extends Person {
    private String technical;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, boolean gender, String technical) {
        super(id, name, dateOfBirth, gender);
        this.technical = technical;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                super.toString() +
                "technical='" + technical +
                '}';
    }
}
