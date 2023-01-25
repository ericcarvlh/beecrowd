import java.util.Scanner;

public class Bee1073 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero > 5) {
            if (numero < 2000) {
                int index = 1;
                while (index <= numero) {
                    if (index % 2 == 0) {
                        int numeroAoQuadrado = index * index;
                        System.out.printf("%d^2 = %d\n", index, numeroAoQuadrado);
                    }
                    index++;
                }
            }
        }

        entrada.close();
    }
}