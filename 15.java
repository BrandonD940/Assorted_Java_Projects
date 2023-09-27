import java.util.*;
import java.util.Arrays;
import java.io.*;

public class Main 
{
  public static void printCharacters(char arr[], int first, int last) 
  {
    if (first > last) 
      {
        return;
      }
  else
  {
    System.out.print(arr[first]);
      printCharacters(arr, first + 1, last);
  }
}

public static void main(String[] args) 
  {
    System.out.println();
    char arr[] = {'B', 'r', 'a', 'n', 'd', 'o', 'n'};
    printCharacters(arr, 0, arr.length-1);
  }
}