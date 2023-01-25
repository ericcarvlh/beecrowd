import java.io.IOException;
import java.util.Scanner; 
 
public class Bee1001 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.printf("X = %d\n", sum);
        
        sc.close();
 
    }
}