package StudentGradeCalculator;
import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numSubjects = s.nextInt();

        double [] marksArray = new double[numSubjects];

        for(int i=0; i<numSubjects;i++){
            System.out.println("Enter marks obtained in subject " + (i+1) + ": ");
            marksArray[i] = s.nextDouble();
        }

        double totalMarks = 0;
        for(double marks : marksArray){
            totalMarks += marks;
        }

        double averagePercentge = (totalMarks / numSubjects) * 100;

        String grade;
        if(averagePercentge >= 90){
            grade = "A+";
        }else if(averagePercentge >= 80){
            grade = "A";
        }else if(averagePercentge >= 70){
            grade = "B";       
         } else if(averagePercentge >= 60){
            grade = "C";
        }else if(averagePercentge >= 50){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.println("Total marks: \u001B[34m " + totalMarks +"\u001B[0m");
        System.out.println("Average Percentage: \u001B[33m" + averagePercentge + "\u001B[0m");
        System.out.println("Grade:  \u001B[32m" + grade + "\u001B[0m") ;
    }
}
