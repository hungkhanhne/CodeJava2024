package javainterface;

import java.util.Date;

import java.util.Scanner;

import java.text.ParseException;

import java.text.SimpleDateFormat;

public class Processor {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        StudentList studentList = new StudentList();

        boolean exit = false;

        while (!exit) {

            System.out.println("Choose an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");
            System.out.println(" ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    String dob = scanner.nextLine();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateOfBirth = formatter.parse(dob);
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Enter Major: ");
                    String major = scanner.nextLine();
                    studentList.addStudent(new Student(id, fullName, dateOfBirth, gpa, major));
                    System.out.println(" ------------------");

                    break;

                case 2:

                    System.out.print("Enter ID of the student to update: ");
                    String updateId = scanner.nextLine();
                    Student studentToUpdate = studentList.findStudentById(updateId);

                    if (studentToUpdate != null) {
                        System.out.print("Enter new GPA: ");
                        float newGpa = scanner.nextFloat();
                        scanner.nextLine();
                        studentToUpdate.setGPA(newGpa);
                        System.out.println("Student updated successfully.");
                        System.out.println("----------- -");

                    } else {

                        System.out.println("Student not found.");
                        System.out.println("------ -");

                    }
                    break;
                case 3:
                    
                    System.out.print("Enter ID of the student to delete: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudentById(deleteId);
                    System.out.println("Student deleted successfully.");
                    System.out.println(" --");

                    break;

                case 4:

                    studentList.displayAllStudents();

                    break;
            }
        }
    }

}
            