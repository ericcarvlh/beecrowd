import java.io.IOException;
import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int prodAB = sc.nextInt();
        prodAB *= sc.nextInt();
        int prodCD = sc.nextInt();
        prodCD *= sc.nextInt();
        
        int dif = (prodAB - prodCD);
    
        System.out.printf("DIFERENCA = %d\n", dif);
        
        sc.close();
 
    }
}