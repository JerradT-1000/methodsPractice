import java.util.Scanner;

public class distance {
   
   public static double distance_between(double lat1, double lon1, double lat2, double lon2){
      
      lat1 = Math.toRadians(lat1);
      lon1 = Math.toRadians(lon1);
      lat2 = Math.toRadians(lat1);
      lon2 = Math.toRadians(lon2);
      
      double earthRadius = 6371.01; //kilometers
      return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
   }
   
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Input lattitude of coordinate 1: ");
      double lat1 = input.nextDouble();
      System.out.println("Input longitude of coordinate 1: ");
      double lon1 = input.nextDouble();
      System.out.println("Input lattitude of coordinate 2: ");
      double lat2 = input.nextDouble();
      System.out.println("Input longitude of coordinate 2: ");
      double lon2 = input.nextDouble();
      
      System.out.println("The distance between those points is: " + distance_between(lat1, lon1, lat2, lon2) + " km\n");
   }
}