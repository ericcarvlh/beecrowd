import java.io.IOException;
import java.util.Scanner;

public class Bee1014 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int totalDistance = sc.nextInt();
        double spentFuel = sc.nextDouble();
        
        double averageConsu = (totalDistance / spentFuel);
        
        System.out.printf("%.3f km/l\n", averageConsu);
        
        sc.close();
 
    }
 
}