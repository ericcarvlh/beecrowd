import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorA = entrada.nextInt(),
        valorB = entrada.nextInt();

        if ((valorA % valorB == 0) || (valorB % valorA == 0))
            System.out.println("Sao Multiplos");
        else 
            System.out.println("Nao sao Multiplos");

        entrada.close();
    }
}
