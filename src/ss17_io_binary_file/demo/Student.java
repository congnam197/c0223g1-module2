package ss17_io_binary_file.demo;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String classes;

    public Student() {
    }

    public Student(int id, String name, String classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
    }

    public int getCode() {
        return id;
    }

    public void setCode(int code) {
        this.id = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
