import java.io.IOException;
import java.util.Scanner;

public class Bee1005 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
 
        double num1 = sc.nextDouble(); 
        double num2 = sc.nextDouble();
        
        double media = ((num1*3.5) + (num2*7.5)) / 11;
        
        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}