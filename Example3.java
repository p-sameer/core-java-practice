import java.util.Scanner;
// main class
class Example3{
// main method
public static void main(String[] args){
  Scanner s= new Scanner(System.in);
  System.out.print("Enter any year:");
  int year =s.nextInt();
  boolean flag =false;
  if(year % 400 == 0)
  {
    flag=true;
  }
  else if(year% 100==0)
  {
    flag=false;
  }
  else if(year %4==0)
  {
   
    flag=false;
  }
  if(flag)
  {
    System.out.println("Year"+year+" is a Leap year");
    }
  else
  {
    System.out.println("Year"+year+" is not a leap yeae");
  }
  }
}