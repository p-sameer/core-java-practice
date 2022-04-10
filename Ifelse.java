//Importing scanner class
import java.util.Scanner;

//main class
class Ifelse{
// main method
public static void main(String[] args){

 //variable
int num;

 //creating an object using scanner class
Scanner s= new Scanner(System.in);

 //user input
System.out.println("Enter the number:");
num= s.nextInt();

 //If condition
if (num % 2 == 0){
System.out.println("Number is Even");
}

 //Else condition
else{
System.out.println("Number is odd");
}
}
}