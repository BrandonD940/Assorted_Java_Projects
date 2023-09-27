import java.util.Scanner;

public class Main 
{
  public static int product(int a, int b) 
  {
    if (b == 0) 
    {
      return 0;
    }
      return a + product(a, b-1);
}

public static void main(String[] args) 
{
  int a;
  int b;

       Scanner cin = new Scanner (System.in);

        System.out.println();
        System.out.println("Enter Value for A: ");
          a = cin.nextInt();
        System.out.println();
        System.out.println("Enter  Value for B: ");
          b = cin.nextInt();
          System.out.println();
      cin.close();

    System.out.println("The product is: " + (product(a, b)));
    return;
  }
}