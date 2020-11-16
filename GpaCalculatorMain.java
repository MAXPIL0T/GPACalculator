import java.util.Scanner;

public class GpaCalculatorMain {

   public static void main(String[] args) {
   
      String input = "";
   
      Scanner scan = new Scanner(System.in);
      GpaCalculator calc = new GpaCalculator();
      
      System.out.println("Welcome to the GPA calculator!");

      
      while(true) {
         System.out.println("Type grade (a, a-, b+, etc.).");
         System.out.println("Press x if you are done entering your classes. ");
         input = scan.nextLine();
         if (input.equals("x")) { break; }
         System.out.println("Enter credits and press enter.");
         calc.addClass(input, Integer.parseInt(scan.nextLine()));
      }
      
      System.out.println("Your GPA: " + calc.getGpa());
      System.out.println("Total Credits: " + calc.getTotalCredits());
   
   }

}