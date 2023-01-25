import java.util.Scanner;

public class Bee1060 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int index = 0, cont = 0;
        while (index < 6) { // 0 é neutro então não levamos em conta.
            double numero = entrada.nextDouble();
            if (numero >= 0)
                cont++;
            index++;
        }

        System.out.printf("%d valores positivos\n", cont);

        entrada.close();
    }
}
