/* THIS WORK BELONGS TO JERRAD STUTZMAN*/
/********************************/
/*Program: final */
/*CIS163AA             */
/*Elliot Cherner       */
/*07/20/2017           */
/* this program demonstrates the game PLINKO from the price is right*/
/*******************************/

import java.util.Scanner;
import java.util.Random;

public class finalProject {
   
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      
      int numSlots = 5;
      
      printIntro(); //Call the inro method
      
      System.out.print("Enter amount (max:10) of balls being played: ");  //promt user to assign numBalls
      int numBalls = scnr.nextInt();
      if (numBalls > 10){
         System.out.print("Error: Too many balls bro!");  //if user tries to play more than 10 balls, game is terminated
         return;
      }
      
      System.out.print("\n");
      
      ballBounce(numBalls, numSlots); //Call the ballBounce method
   }
   
   public static void ballBounce(int numBalls, int numSlots){
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random();
      
      //insert loop that repeats for each ball
      //loop counts each right and left bounce 
      int[] slots = new int[numSlots];
      int count;
      int numRightBounce = 0;
      
      for (int b = 0; b < numBalls; b++){
         count = 1;
         numRightBounce = 0;
         
         System.out.print("Ball bounced: ");
         while (count <= numSlots - 1){     //this loop prints how the balls bounced in play
            int randVal = rand.nextInt(2);  //random utility used to assign a value to give random bounces
            
            
            if (randVal == 0){
               System.out.print("L");
            }
            else {
               numRightBounce++;;      //right bounces are counted to compute how the array is filled
               System.out.print("R");
            }
            
            count++;
            
         }
         if (numRightBounce == 0){    //loop fills array by counting right bounces from above
             slots[0] = slots[0] + 1;
            
            }
            else if (numRightBounce == 1){
               slots[1] = slots[1] + 1;
          
            }
            else if (numRightBounce == 2){
               slots[2] = slots[2] + 1;
            
            }
            else if (numRightBounce == 3){
               slots[3] = slots[3] + 1;
            
            }
            else{
               slots[4] = slots[4] + 1;
            
            }
         System.out.print("\n");
      }
      computeScore(slots);   //score method called
   
   }
   public static void computeScore(int[] slots){
   
      int numSlots = 5;
      int[] slotScore = new int[numSlots];
      int j = 0;
      int score = 0;
      
      
      slotScore[0] = slots[0];         //using slot array with calculations to fill score array
      slotScore[1] = slots[1] * 2;
      slotScore[2] = slots[2] * 3;
      slotScore[3] = slots[3] * 2;
      slotScore[4] = slots[4];
      
      System.out.println("\nNumber of balls per slot:");
      SLOTS(slots[0], slots[1], slots[2], slots[3], slots[4]);   //calling the SLOT method to print array
      System.out.println("\nScore per slot:");
      SLOTS(slotScore[0], slotScore[1], slotScore[2], slotScore[3], slotScore[4]);
      
      for (j = 0; j < numSlots; j++){  //loop to add all scores from array
         score = score + slotScore[j];
      }
      
      System.out.println("\nFinal score: " + score);
      
      return;  
   }
   
   //method to print array info to save space
   public static void SLOTS(int a, int b, int c, int d, int e){
     
      
      System.out.print("|" + a + "|" + b + "|" + c + "|" + d + "|" + e + "|\n");
   
   }
   //method to print game intro 
   public static void printIntro(){
   
      System.out.println("!!!!!!!!!!");
      System.out.println("   THIS");
      System.out.println("    IS");
      System.out.println("  PLINKO");
      System.out.println("!!!!!!!!!!\n");
      
      System.out.println("Here is the game board");
      
      System.out.println("    / o \\ ");
      System.out.println("   / o o \\ ");
      System.out.println("  / o o o \\ ");
      System.out.println(" / o o o o \\ ");
      System.out.println("| 1|2|3|2|1 |\n");
      
      System.out.println("The object of the game is to score as many points as you can.");
      System.out.println("For the best score, try to get balls to drop into \nthe middle slot on the bottom.");
      System.out.println("Good Luck!\n");
      
      return;
   }
}