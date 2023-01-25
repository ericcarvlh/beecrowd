import java.io.IOException;
import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        
        int N = sc.nextInt();
        
        int seconds = N % 60;
        int minutes = (N % 3600) / 60;
        int hour = N / 3600;
        
        System.out.printf("%d:%d:%d\n", hour, minutes, seconds);
        
        sc.close();
    }
}