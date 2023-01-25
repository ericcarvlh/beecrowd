import java.io.IOException;
import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
 
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double distance = Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1), 0.5);
        
        System.out.printf("%.4f\n", distance);
        
        sc.close();
    }
}