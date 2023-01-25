import java.io.IOException;
import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int tempoDeViagem = entrada.nextInt(), velocidadeMedia = entrada.nextInt();

        double litrosConsumidos = (tempoDeViagem * velocidadeMedia) / 12.00;

        System.out.printf("%.3f\n", litrosConsumidos);

        entrada.close();
    }
}
