import java.util.Scanner;

public class Bee1078 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero > 2) {
            if (numero < 1000) {
                int index = 1;
                while (index <= 10) {
                    int resultadoTabuada = numero * index;
                    System.out.printf("%d x %d = %d\n", index, numero, resultadoTabuada);
                    index++;
                }
            }
        }

        entrada.close();
    }
}