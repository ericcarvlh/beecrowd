import java.io.IOException;
import java.util.Scanner;

public class Bee1071 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt() - 1;
        int Y = sc.nextInt();
        int result = 0;

        for (int i=X; i>Y; i--){
            
            if (i % 2 != 0)
                result += i;
        }
        
        System.out.printf("%d\n", result);
        
        sc.close();
    }
}