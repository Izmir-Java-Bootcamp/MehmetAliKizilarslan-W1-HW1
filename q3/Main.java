package week1.hw1.git.q3;

public class Main {
    public static void main(String[] args) {
        //step1
        Student s1 = new Student("Mehmet Ali",5005,3.17,new PersonalData(2000,6,12,180055));
        Student s2 = new Student("Crow",5006,3.0,new PersonalData(1998,1,24,100001));
        Student s3 = new Student("Jack",5007,2.50,new PersonalData(1999,5,12,100002));
        Student s4 = new Student("Yusei",5008,3.21,new PersonalData(1998,3,21,100003));
        Student s5 = new Student("Akiza",5009,2.17,new PersonalData(1999,8,3,100004));

        //step2
        Course cK129 = new Course("K129",3);

        //step 3
        if(cK129.addStudent(s1)){
            System.out.println("added");
        }
        cK129.addStudent(s2);
        cK129.addStudent(s3);
        cK129.addStudent(s4);

        //System.out.println(cK129.getBestStudent());
        //step 4
        cK129.list();

        //step 5
        cK129.increaseCapacity();


        //step 6
        cK129.addStudent(s4);
        cK129.addStudent(s5);

        //step7
        cK129.list();



    }
}
