package ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model;

public class Student extends Person {
    private String classRoom;
    private double score;

    public Student(int id, String name, String dateOfBirth, boolean gender, String classRoom, double score) {
        super(id, name, dateOfBirth, gender);
        this.classRoom = classRoom;
        this.score = score;
    }

    public Student(String classRoom, double score) {
        this.classRoom = classRoom;
        this.score = score;
    }

    public Student() {
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Studen {" +
                super.toString() +
                "classRoom='" + classRoom + '\'' +
                ", score=" + score +
                '}';
    }
}
