
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number of subject:");
       int numsubject=sc.nextInt();
       int[]marks = new int[numsubject];
       int totalMarks = 0;
       for(int i=0;i<numsubject;i++){
        System.out.println("Enter marks obtained in subject"+(i+1)+"(out of 100)");
        marks[i]=sc.nextInt();
        totalMarks=totalMarks+marks[i];
        if(marks[i]>100){
        System.out.println("Enter marks within a 100");
        System.out.println("Start again:!!!!");
        return ;
        }
       }
       double averagePercentage = (double)totalMarks/numsubject;
       char grade;
       if(averagePercentage>=90){
        grade='A';
       }
       else if(averagePercentage>=80){
        grade='B';
       }
       else if(averagePercentage>=70){
        grade='C';
       }
       else if(averagePercentage>=60){
        grade='D';
       }
       else if(averagePercentage>=50){
        grade='E';
       }
       else{
        grade='F';
       }
       //Display Results
       int results=numsubject*100;
       System.out.println("\nFull Marks of total "+numsubject+" subject:"+results);
       System.out.println("Total Marks:"+totalMarks);
       System.out.println("Average Percentage: "+averagePercentage);
       System.out.println("Grade:"+grade);
       if(averagePercentage>=50){
        System.out.println("Congulation you get "+averagePercentage+" Percentage and You are pass and promoted to next class.\"THANKS YOU SO MUCH!!!!!!\"");
       }
       else{
        System.out.println("Sorry to say that you are fail.So do hardwork and try again next year!!!");
       }
       sc.close();
    }
    
}
