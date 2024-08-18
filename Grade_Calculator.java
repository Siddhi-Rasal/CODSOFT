import java.util.*;
public class Grade_Calculator{
    public static void main(String args[]){
        float totalMarks = 0;
        int totalSubjects = 5;
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the marks of following Subjects out of 100 :");
   
        
        for(int i = 1; i<=totalSubjects; i++){
      System.out.println("Enter marks of subject"+i+":");
      int marks = sc.nextInt();
      totalMarks += marks;
    }
     
    System.out.println("Total Marks :"+totalMarks);

    float averagePercentage = totalMarks/totalSubjects;
    System.out.println("Average Percentage ="+averagePercentage+"%");

    char grade = calculateGrade(averagePercentage);
    System.out.println("Grade is : "+grade);

   sc.close();
  }
     static char calculateGrade(float averagePercentage){
    if(averagePercentage >= 90){
      return 'A';
    }
    else if( averagePercentage< 90 && averagePercentage >= 80){
      return 'B';
    }else if (averagePercentage < 80 && averagePercentage >= 60) {
      return 'C';
    }else if(averagePercentage < 60 && averagePercentage >= 35){
      return 'D';
    }else{
      return 'F';
    }
  }
}
