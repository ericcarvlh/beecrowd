import java.io.IOException;
import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double wage = sc.nextDouble();
        double saleValue = sc.nextDouble();
        double total = (saleValue * 0.15) + wage;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        sc.close();
    }
}