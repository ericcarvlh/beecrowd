import java.util.Scanner;
import java.io.IOException;

public class Bee1016 {
    public static void main(String[] args) throws IOException{
        
        Scanner entrada = new Scanner(System.in);

        int quilometros = entrada.nextInt();

        // 1 quilometro a cada 2 minutos
        // entao basta multiplicar por 2 
        int minutos = quilometros * 2;

        System.out.printf("%d minutos\n", minutos);

        entrada.close();
    }
}