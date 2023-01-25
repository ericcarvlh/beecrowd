import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

        double valorA = entrada.nextDouble(), 
        valorB = entrada.nextDouble(), 
        valorC = entrada.nextDouble();

        if (valorA == 0)
            System.out.println("Impossivel calcular");
        else {
            double valorDelta = (valorB * valorB) - 4 * valorA * valorC;
            if (valorDelta >= 0) {
                double calculoPositivo = (- valorB + Math.sqrt(valorDelta)) / (2 * valorA);
                double calculoNegativo = (- valorB - Math.sqrt(valorDelta)) / (2 * valorA);

                System.out.printf("R1 = %.5f\nR2 = %.5f\n", calculoPositivo, calculoNegativo);
            } else 
                System.out.println("Impossivel calcular");
        }

        entrada.close();
    }
}
