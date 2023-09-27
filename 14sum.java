public class Sum 
{
  private int a;
  private int b;

public Sum() 
  {
  } 

public int getA() 
  {
   return a;
  }

public void setA(int a) 
  {
   this.a = a;
  }

public int getB() 
  {
   return b;
  }

public void setB(int b) 
  {
   this.b = b;
  }

int Sum(int a,int b)
  {
   if(a==b)
       return a;
   else
       return a+Sum(a-1,b);
  }
}