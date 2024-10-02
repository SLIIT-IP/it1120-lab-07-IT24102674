import java.util.Scanner;

public class IT24102674Lab7Q1B {
 public static void main(String[]args) {

  int marks , total = 0 ,x,student=1;
  double avg;
  String grade;
   
  Scanner input = new Scanner (System.in);

  while(student<=3)
  {
   System.out.println("Student " + student);
   x=1;
   while(x<=4)
   {
    System.out.print("Enter Marks :");
    marks = input.nextInt();
  
    total=marks + total;
    x++;
   }
   avg=total/4;
    if(avg<=100 && avg>=75)
    grade="Distinction";
  
    else if (avg<=74 && avg>=50)
     grade="Credit";
  
    else
     grade="Fail";

     System.out.println(" Average is : " + avg);
     System.out.println( " Overall Grade is : " + grade);


   student++;
 }
 
 }
}
