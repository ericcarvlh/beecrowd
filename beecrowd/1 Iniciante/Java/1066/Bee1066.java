import java.util.Scanner;

public class Bee1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int index = 0, 
        numeroPar = 0,
        numeroImpar = 0,
        numeroPositivo = 0,
        numeroNegativo = 0;

        while (index < 5) {
            int numero = entrada.nextInt();

            if (numero % 2 == 0)
                numeroPar++;
            else 
                numeroImpar++;
            
            if (numero > 0) // 0 é neutro então não levamos em conta.
                numeroPositivo++;
            else if (numero < 0) // 0 é neutro então não levamos em conta.
                numeroNegativo++;

            index++;
        }

        System.out.printf("%d valor(es) par(es)\n" +
        "%d valor(es) impar(es)\n" +
        "%d valor(es) positivo(s)\n" +
        "%d valor(es) negativo(s)\n", numeroPar, numeroImpar, numeroPositivo, numeroNegativo);

        entrada.close();
    }
}