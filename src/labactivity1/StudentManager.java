package labactivity1;

import java.util.Scanner;

public class StudentManager {
    static final int MAX_STUDENTS = 2;
    static Student[] students = new Student[MAX_STUDENTS];
    static Scanner sc = new Scanner(System.in);
    static int studentCounter = 0;

    public static void main(String[] args) {
        String input = ""; //empty string
        do{
            displayMenu();
            input = sc.nextLine();
            switch (input.toUpperCase()) {
                case "A":
                    addStudent();
                    break;
                case "B":
                    removeStudent();
                    break;
                case "C":
                    displayAllStudents();
                    break;
            }
        }while(!input.toUpperCase().equals("D"));

    }

    public static void displayMenu(){
        System.out.println("=== Student Management System ===");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student by ID");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");
        System.out.print("Choose an option: ");
    }

    public static void addStudent(){
        //ask name, age, student, gpa
        if(studentCounter == MAX_STUDENTS){
            //guard if
            System.out.println("Array is full");
            return;
        }
        System.out.println("Student ##:" + studentCounter);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Student GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();
//        Student student = new Student(name,age,id,gpa);
//        students[0] = student;
        students[studentCounter++] = new Student(name, age, id, gpa);
//        studentCounter++;
    }

    public static void displayAllStudents(){
        if(studentCounter == 0){
            System.out.println("Array is empty");
            return;
        }
//        for(Student student : students){
//            student.displayInfo();
//        }
        for(int i = 0 ; i < studentCounter; i++){
            students[i].displayInfo();
        }
    }

    public static void removeStudent(){
        //input student id
        System.out.print("Enter student id to remove: ");
        String id = sc.nextLine();
        int studentIndex = findStudent(id);
        if(studentIndex == -1){
            System.out.println("Student not found");
            return;
        }
        System.out.println("Found at " + studentIndex + " counter: " + studentCounter);
        //shift
        for(int i = studentIndex ; i < studentCounter-1; i++){
            System.out.println(i);
            students[i] = students[i + 1];
        }
        students[--studentCounter] = null;
    }

    public static int findStudent(String id){
        //returns negative if not found; 0 or + found
        int index = -1;
        for(int i = 0; i < studentCounter; i++){
            if(students[i].getStudentId().equals(id)){
                index = i;
                return index;
            }
        }
        return index;
    }
}
