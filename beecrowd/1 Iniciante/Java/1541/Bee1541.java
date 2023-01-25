import java.util.Scanner;
import java.lang.Math;

public class Bee1541 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A, B, C = 0;
        
        do {
            A = sc.nextInt();
            if((A <= 0 || A > 1000))
                System.exit(0);
            B = sc.nextInt();
            if((B <= 0 || B > 1000))
                System.exit(0);
            C = sc.nextInt();
            if((C <= 0 || C > 1000))
                System.exit(0);

            int lado = (int) Math.sqrt(((A * B * 100) / C));
            System.out.println(""+lado);
            
        } while((A != 0) || (B != 0) || (C != 0));
        sc.close();
	}
}