import java.util.Scanner;

  public class IT24102674Lab7Q3 {
       public static void main(String[]args) {

  int customer = 1;
  double discount=0 , total_amount=0, bill_amount=0;
  char method;
 
  Scanner input = new Scanner (System.in);
  
  while(customer<=5)
  { 
    System.out.println( "Customer " + customer);
    System.out.print("Enter total bill amount :");
    bill_amount=input.nextInt();

    System.out.print("Enter mode of payment (C for cash , O for other ): ");
    method=input.next().charAt(0);
 
    if(method=='c' || method=='C')
    {
     discount=bill_amount*5/100;
     total_amount=bill_amount-discount;
    }
 else if(method=='o' || method=='O')
    {
     discount=0;
     total_amount=bill_amount-discount;

    }
    else
    {
    System.out.println("Payment Mode is Not Valid ");
    continue;
    }
    System.out.println( "Enter total bill amount :" + bill_amount);
    System.out.println( "Discount is : " + discount);
    System.out.println( "Amount to be paid : " + total_amount);
   
  cus++;
  }
 }
}