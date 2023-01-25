import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Bee1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double ray = sc.nextDouble();
        double area = (3.14159 * Math.pow(ray, 2));
        
        System.out.printf("A=%.4f\n", area);
        
        sc.close();
    }
}