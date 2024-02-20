package Comparable;

public class Student implements Comparable<Student> {
    int rollno;
    String name;

    public Student(int rollno,String name){
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}
