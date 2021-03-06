package week1.hw1.git.q3;

import java.util.Arrays;

public class Course {
    private String name;
    private Student[] students;
    private int capacity;
    private int numberOfStudent=0;

    public Course(String name) {
        this.name = name;
        this.capacity = 40; //default value
        this.students = new Student[40];
    }

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public boolean addStudent(Student newStudent){
        //check for same student with loop
        if((getNumberOfStudent()) < this.capacity ){


            this.students[numberOfStudent] = newStudent;

            this.numberOfStudent++;
            return true; //if student added
        }
        return false;
    }


    public boolean dropStudent(Student oldStudent){
        for(int i = 0 ; i < this.numberOfStudent; i++){
            if(oldStudent.getStudentId() == this.students[i].getStudentId()) //searching student
            {
                //copying the same array without the old student
                System.arraycopy(this.students, i+1, this.students,i,this.numberOfStudent-i);

                this.numberOfStudent--;
                return true;
            }
        }
        return false;
    }


    public void increaseCapacity(){
        this.capacity += 5;
        Student[] stds = new Student[this.capacity];

        for(int i = 0 ; i < this.numberOfStudent;i++){
            stds[i] = this.students[i];
        }

        this.students = new Student[this.capacity];
        for(int i = 0 ; i < this.numberOfStudent;i++){
            this.students[i] = stds[i];
        }
    }

    public Student getBestStudent(){
        Student bestStudent = students[0];

        for (Student student : students) {
            if (bestStudent.getGpa() < student.getGpa()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public Student getYoungestStudent(){ //compareTo(java.time.LocalDate)
        Student youngestStudent = this.students[0];

        for (Student student : students) {
            if (youngestStudent.getPd().getBirthDate().getYear() >= student.getPd().getBirthDate().getYear()) {
                if (youngestStudent.getPd().getBirthDate().getMonthValue() >= student.getPd().getBirthDate().getMonthValue()) {
                    youngestStudent = student;
                }
            }

        }
        return youngestStudent;
    }

    public void clear() { //deletes all student from a course
        this.students = new Student[0];
    }

    public void list(){// prints all students enrolled to the course to the screen.
        for(int i = 0 ; i < getNumberOfStudent() ; i++)
            System.out.println(this.students[i].getName());
    }
    /*
    */



}
