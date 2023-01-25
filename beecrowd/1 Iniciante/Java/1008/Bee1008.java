import java.io.IOException;
import java.util.Scanner;
 
public class Bee1008 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int numFunc = sc.nextInt();
        int hours = sc.nextInt();
        double hourValue = sc.nextDouble();
        
        double salaryFunc = hours * hourValue;
        
        System.out.printf("NUMBER = %d\n", numFunc);
        System.out.printf("SALARY = U$ %.2f\n", salaryFunc);
        
        sc.close();

    }
}