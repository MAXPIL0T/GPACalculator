import java.util.*;

public class GpaCalculator {

   private double totalCredits;
   private List<Double> gradesList;

   public GpaCalculator() {
      totalCredits = 0;
      gradesList = new ArrayList<>();
   }
   
   public void addClass(String grade, double credits) {
      totalCredits += credits;
      gradesList.add(gradeToNum(grade) * credits);
   }
   
   private double gradeToNum(String grade) {
      if (grade.equals("a")) { return 4.0; }
      else if (grade.equals("a-")) { return 3.7; }
      else if (grade.equals("b+")) { return 3.3; }
      else if (grade.equals("b")) { return 3.0; }
      else if (grade.equals("b-")) { return 2.7; }
      else if (grade.equals("c+")) { return 2.3; }
      else if (grade.equals("c")) { return 2.0; }
      else if (grade.equals("c-")) { return 1.7; }
      else if (grade.equals("d+")) { return 1.3; }
      else if (grade.equals("d")) { return 1.0; }
      else if (grade.equals("f")) { return 0.0; }
      else { return 0.0; }
   }
   
   public double getGpa() {
      double gradeCount = 0.0;
      
      for (double grade : gradesList) {
         gradeCount += grade;
      }
      
      return Math.round((gradeCount / totalCredits) * 1000.0) / 1000.0;
   }
   
   public double getTotalCredits() {
      return totalCredits;
   }

}