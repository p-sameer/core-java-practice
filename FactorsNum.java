import java.util.Scanner;
public class FactorsNum {
   public static void main(String[] args) {
      int my_input, i;
      my_input = 45;
      System.out.println("The number is defined as " +my_input);
      System.out.print("The factors of " + my_input + " are: ");
      for (i = 1; i <= my_input; ++i) {
         if (my_input % i == 0) {
            System.out.print(i + " ");
         }
      }
   }
}