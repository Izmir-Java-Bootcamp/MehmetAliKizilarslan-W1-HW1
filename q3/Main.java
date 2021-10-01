package week1.hw1.git.q3;

public class Main {
    public static void main(String[] args) {
        //step1 5 students are created. Let one of them has the ID 5005.
        Student s1 = new Student("Mehmet Ali",5005,3.17,new PersonalData(2000,6,12,180055));
        Student s2 = new Student("Crow",5006,3.0,new PersonalData(1998,1,24,100001));
        Student s3 = new Student("Jack",5007,2.50,new PersonalData(1999,5,12,100002));
        Student s4 = new Student("Yusei",5008,3.21,new PersonalData(1998,3,21,100003));
        Student s5 = new Student("Akiza",5009,2.17,new PersonalData(1999,8,3,100004));

        //step2 A course (let us call it K129) with a capacity of 3 is created
        Course cK129 = new Course("K129",3);

        //step3 Any 4 of the students is added to K129.
        cK129.addStudent(s1);
        cK129.addStudent(s2);
        cK129.addStudent(s3);
        cK129.addStudent(s4);

        //step 4 All students of K129 are printed on the screen.
        cK129.list();

        //step5 The capacity of K129 is increased.
        cK129.increaseCapacity();


        //step6 Remaining 2 students are added to K129.
        cK129.addStudent(s4);
        cK129.addStudent(s5);

        //step7 All students of K129 are printed on the screen.
        cK129.list();

        //step8 Student with ID 5005 is dropped from K129.
        cK129.dropStudent(s1); // the method is asking for a Student object but the mission is asking to integer

        //step9 All students of K129 are printed on the screen.

        //step10 Number of students enrolled to K129 is printed.

        //step11 Birth year of best student of K129 is printed on the screen.
        // (You should use - getYear() method of java.util.Date class.)

        //step12 A new course (let us call it K130) is created.
        Course cK130 = new Course("K130");
        //step13 All students currently enrolled in K129 are added to K130.
        // (You should use - getStudents() method).

        //step14 All students of K129 are removed from the course.

        //step15 Student with ID 5005 is dropped from K129 and result
        // of the operation is printed - on the screen.

        //step16 All students of K130 are printed on the screen.

        //step17 Best student of K130 is dropped from K130.

        //step18 All students of K130 are printed on the screen.

        //step19 GPA of youngest student of K130 is printed on the screen.

        //step20 Courses K129 and K130 are printed on the screen.
        cK129.list();
        cK130.list();

    }
}
