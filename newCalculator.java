/* THIS WORK BELONGS TO JERRAD STUTZMAN*/
/********************************/
/*Program: newCalculator */
/*this program emulates a calculator*/
/*******************************/

import java.util.Scanner;

public class newCalculator {

   //method applies the numbers and operator into the formula
   public static double formula(char operator, double numA, double numB){
   
      double solution = 0.0;
      
      //distinguishes between operator
      switch (operator){
         case 'A':
            solution = numA + numB;
            break;
         case 'S':
            solution = numA - numB;
            break;
         case 'M':
            solution = numA * numB;
            break;
         case 'D':
            solution = numA / numB;
            break;
      }
      return solution;
   }
   
         
   public static void main(String[] args) {
   
      char operator;
      double num1 = 0.0;
      double num2 = 0.0;
      double solution = 0.0;
      Scanner scnr = new Scanner(System.in);
      
      //get formula input from user.
      System.out.println("Enter the first number in the equation: ");
      num1 = scnr.nextInt();
      
      System.out.println("Please enter (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision");
      operator = scnr.next().charAt(0);
      operator = Character.toUpperCase(operator);
      
      System.out.println("Enter the second number in the equation: ");
      num2 = scnr.nextInt();
            
      solution = formula(operator, num1, num2);
      System.out.println(solution);      
   }
}
