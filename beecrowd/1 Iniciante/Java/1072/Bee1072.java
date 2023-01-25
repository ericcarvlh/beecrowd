import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeLeitura = entrada.nextInt(), 
        index = 0, 
        dentroDoIntervalo = 0, 
        foraDoItervalo = 0;

        while (index < quantidadeLeitura) {
            int numero = entrada.nextInt();
            if (numero >= 10 && numero <= 20)
                dentroDoIntervalo++;
            else 
                foraDoItervalo++;

            index++;
        }

        System.out.printf("%d in\n%d out\n", dentroDoIntervalo, foraDoItervalo);

        entrada.close();
    }
}
