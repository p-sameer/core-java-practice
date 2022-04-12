import java.util.Scanner;
class ArrayDuplicate{
  
// main method
public static void main(String[] args)
{
int arr[] ={2,6,9,3,6,9};
  for (int i=0;i < arr.length-1;i++){
    for(int j = i+1;j < arr.length;j++)
      if((arr[i]==arr[j]) && (i!=j)){
        System.out.println("duplicate element is" + arr[j]);
      }
  }
  }
}