import java.util.Scanner;
class weekday{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter weekday to print week number ");
int weekday;
  weekday=s.nextInt();
switch(weekday)
{
case 1:
      if (weekday == 1)
      System.out.println("Its Monday");
      break;
case 2:
      if( weekday == 2)
      System.out.println("Its Tuesday");
      break;
case 3:
      if (weekday == 3)
      System.out.println("Its  Wednesday");
      break;
case 4:
      if (weekday ==  4)
      System.out.println("Its Thursday");
      break;
case 5:
     if (weekday == 5)
      System.out.println("Its Friday");
      break;
case 6:
      if (weekday == 6)
      System.out.println("Its Saturday");
      break;
case 7:
     if (weekday == 7)
      System.out.println("Its Sunday");
      break;
default:
       System.out.println("Wrong Choice");    
}
  }
}