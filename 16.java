import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
  
public static int arraySearch(int arr[], int start, int end, int aKey)
{

if (start <= end) 
{
  int mid = (start + end) / 2;

if (arr[mid] == aKey)
  return mid;

if (arr[mid] > aKey)
  return arraySearch(arr, start, mid - 1, aKey);

else
  return arraySearch(arr, mid + 1, end, aKey);
}

  return -1;
}

public static void main(String[] args) 
{
  Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("How many values will the array hold?");
        int num = input.nextInt();

        int arr[] = new int[num];

        System.out.println();
        System.out.println("Enter the " + num + " values now.");

        for (int i = 0 ; i < arr.length; i++ ) 
        {
           arr[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Enter the aKey");
        int aKey = input.nextInt();
        
      input.close();

  int result = arraySearch(arr, 0, arr.length - 1, aKey);

if (result == -1)
{
  System.out.println();
  System.out.println("Element aKey not present");
}

else
{
  System.out.println();
  System.out.println("Element aKey found at index " + result);
}

  }
}