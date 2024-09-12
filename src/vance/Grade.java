package vance;

import java.util.Scanner;

public class Grade {
    Grades[] students;
    int numberOfStudents;

    public void getGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();
        students = new Grades[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter details for student " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
                System.out.print("Name: ");
            String name = scanner.next();
                System.out.print("Prelim: ");
            double prelim = scanner.nextDouble();
                System.out.print("Midterm: ");
            double midterm = scanner.nextDouble();
                System.out.print("Prefi: ");
            double prefi = scanner.nextDouble();
                System.out.print("Final: ");
            double finalGrade = scanner.nextDouble();

            students[i] = new Grades();
            students[i].addGrade(id, name, prelim, midterm, prefi, finalGrade);
        }

        calculateResults();
    }

   
    public void calculateResults() {
        double totalAverage = 0;
        int passed = 0;
        int failed = 0;

        for (Grades student : students) {
            student.viewGrades();
            double studentAverage = student.getAverage();
            totalAverage += studentAverage;

            if (studentAverage <= 3.0) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Total number of students: " + numberOfStudents);
        System.out.println("Class average: " + totalAverage / numberOfStudents);
        System.out.println("Number of students passed: " + passed);
        System.out.println("Number of students failed: " + failed);
    }
}
