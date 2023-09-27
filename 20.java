import java.util.Arrays;
import java.util.*; 

public class Main
{

public static void main (String []args)
{
  int a = 0;
  int b = 0;
  int c = 1;
  System.out.println();
  System.out.println("The first 45 numbers of the fibonacci sequence");
  System.out.println("----------------------------------------------");

  for(int i=1; i<=45; i++)
  {
     {
      a = b;
      b = c;
      c = a + b;
      System.out.println(i + ": " + a);
  }
  }
}
 
public static int FibSequence(int n)
{
  if(n<1)
  {
  System.out.println("Invalid Value");
    return 0;
  }

if(n==1 || n==2)
  return 1;
else
  return FibSequence(n-1) + FibSequence(n-2);
  }
}