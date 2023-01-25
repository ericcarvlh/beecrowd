import java.io.IOException;
import java.util.Scanner;

public class Bee1065 { 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 0;
        int resul = 0;
        int pares = 0;

        int limitador = 1;
        while(limitador <= 5){
            num1 = sc.nextInt();
            
            resul = num1 % 2;
            
            if(resul == 0)
                pares++;
                
            limitador++;
        }
        
        System.out.printf("%d valores pares\n", pares);

        sc.close();
    }
}