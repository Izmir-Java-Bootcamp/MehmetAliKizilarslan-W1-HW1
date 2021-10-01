package week1.hw1.git.q3;

public class Student {
    private String name;
    private long studentId;
    private double gpa;
    private PersonalData pd;

    public Student(String name, long studentId, double gpa, PersonalData pd) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.pd = pd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public PersonalData getPd() {
        return pd;
    }

    public void setPd(PersonalData pd) {
        this.pd = pd;
    }
}
