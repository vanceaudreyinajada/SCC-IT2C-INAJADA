package vance;

public class Grades {
   
    
    
    
    int studentId;
    String studentName;
    double prelimGrade;
    double midtermGrade;
    double prefiGrade;
    double finalGrade;

   
    
    public void addGrade(int id, String name, double prelim, double midterm, double prefi, double finalGrade) {
        this.studentId = id;
        this.studentName = name;
        this.prelimGrade = prelim;
        this.midtermGrade = midterm;
        this.prefiGrade = prefi;
        this.finalGrade = finalGrade;
    }

    
    
    public double getAverage() {
        return (prelimGrade + midtermGrade + prefiGrade + finalGrade) / 4;
    }

    
    public void viewGrades() {
      
        double average = getAverage();
        String remarks = (average <= 3.0) ? "Passed" : "Failed";

        
        
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Prelim: " + prelimGrade);
        System.out.println("Midterm: " + midtermGrade);
        System.out.println("Prefi: " + prefiGrade);
        System.out.println("Final: " + finalGrade);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Remarks: " + remarks);
    }
    
    
    
    
    
    
    
    
    
    
    
} 
