import java.util.Scanner;
public class ArrayNeg
{
  
  public static void main(String[] args) 
  {
    int Size, i;
   Scanner sc = new Scanner(System.in);
    System.out.print(" Please Enter Number of elements in an array : ");
    Size = sc.nextInt();  
    int [] a = new int[Size];
    System.out.print(" Please Enter " + Size + " elements of an Array  : ");
    for (i = 0; i < Size; i++)
    {
      a[i] = sc.nextInt();
    }   
    for(i = 0; i < Size; i++)
    {
      if(a[i] >= 0)
      {
        System.out.println("Positive Number:"+a[i]);
      }
      else
      {
        System.out.println("Negative Number:"+a[i]);
      }
    }  
  }
}