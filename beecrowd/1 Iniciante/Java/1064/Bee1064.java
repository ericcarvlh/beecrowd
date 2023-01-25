import java.util.Scanner;

public class Bee1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int index = 0, cont = 0;
        double somaNumeros = 0, media = 0;        
        while (index < 6 ) { // 0 é neutro então não levamos em conta.
            double numero = entrada.nextDouble();
            if (numero > 0) {
                somaNumeros += numero;
                cont++;
            }
            index++;
        }

        media = somaNumeros / cont;

        System.out.printf("%d valores positivos\n%.1f\n", cont, media);

        entrada.close();
    }
}