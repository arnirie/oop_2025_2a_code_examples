package labactivity1;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("a",1,"12",78);
        student1.displayInfo();
        Student student2 = new Student("b",1,"12",78);
        student2.displayInfo();
        Student student3 = new Student("c",1,"12",78);
        student3.displayInfo();
        student2.study();
        System.out.println(Student.getTotalStudents());
    }
}
