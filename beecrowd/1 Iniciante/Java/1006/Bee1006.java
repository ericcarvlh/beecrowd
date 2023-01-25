import java.io.IOException;
import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
        double media = (num1*2 + num2*3 + num3*5) / (10);
        
        System.out.printf("MEDIA = %.1f\n", media);
        
        sc.close();
 
    }
}