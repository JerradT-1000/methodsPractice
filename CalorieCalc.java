import java.util.Scanner;

public class CalorieCalc {

   public static int stepsToFeet(int baseSteps) {
      int ft_per_step = 3;
      int totalFt = 0; 
      
      totalFt = baseSteps * ft_per_step;
      
      return totalFt;
   }
   public static double stepsToCalories(int baseSteps){
      double steps_per_minute = 70.0;
      double calories_per_minute = 3.5;
      double totalMins = 0.0;
      double totalCals = 0.0;
      
      totalMins = baseSteps / steps_per_minute;
      totalCals = totalMins * calories_per_minute;
      
      return totalCals;
   }
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int stepsInput = 0;
      int totalFt = 0; 
      double totalCals = 0.0;
      
      System.out.print("Enter number of steps walked: ");
      stepsInput = scnr.nextInt();
      
      totalFt = stepsToFeet(stepsInput);
      System.out.println("Feet: " + totalFt);
      
      totalCals = stepsToCalories(stepsInput);
      System.out.println("Calories: " + totalCals);
      
      return;
   }
}