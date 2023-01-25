import java.io.IOException;
import java.util.Scanner; 

public class Bee1004 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int PROD = num1 * num2;
        
        System.out.printf("PROD = %d\n", PROD);
 
        sc.close();
    }
}