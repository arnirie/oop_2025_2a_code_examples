package labactivity1;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    private static int studentCount = 0;

    Student(String name, int age, String studentId, double gpa){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa <65 || gpa > 100){
            System.out.println("Invalid GPA");
            return;
        }
        this.gpa = gpa;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
//        System.out.printf("Name: %s", name);
        System.out.println("Age: " + age);
        System.out.println("StudentId: " + studentId);
        System.out.println("GPA: " + gpa);
    }

    public static int getTotalStudents(){
        return studentCount;
    }
}
