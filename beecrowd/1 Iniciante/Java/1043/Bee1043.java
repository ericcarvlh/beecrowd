import java.util.Scanner;

public class Bee1043 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorA = entrada.nextDouble(), 
        valorB = entrada.nextDouble(), 
        valorC = entrada.nextDouble();

        if (((valorB - valorC)*(+1)) < valorA && valorA < (valorB + valorC) &&
            ((valorA - valorC)*(+1)) < valorB && valorB < (valorA + valorC) &&
            ((valorA - valorB)*(+1)) < valorC && valorC < (valorA + valorB)) { // calcula perimetro
            double perimetro = valorA + valorB + valorC;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else { // calcula area
            double area = ((valorA + valorB) * valorC) / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        entrada.close();
    }
}
