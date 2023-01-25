import java.util.Scanner;

public class Bee1070 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt(), index = 0;

        while (index < 6) {
            if (numero % 2 == 1) {
                System.out.printf("%d\n", numero);                
                numero++;
                index++;
            }
        }

        entrada.close();
    }
}
