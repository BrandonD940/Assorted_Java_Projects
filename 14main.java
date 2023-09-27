import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       int a,b;

       Scanner cin = new Scanner (System.in);
      
       while(true)
       {
        System.out.println();
        System.out.println("Value for A must be larger than the value for B!");
        System.out.println();
        System.out.println("Enter Numeric Value for A: ");
          a = cin.nextInt();
        System.out.println("Enter Numeric Value for B: ");
          b = cin.nextInt();
        if(a>b)
          break;
       else
       {
           System.out.println("Invalid Input. A must be greater than B");
           continue;  
       }
       }

Sum input = new Sum();

System.out.println();
System.out.println("The sum of numbers from "+a+" to "+b+" is: " + input.Sum(a, b));
   }
  }