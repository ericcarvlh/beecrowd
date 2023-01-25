import java.util.Scanner;

public class Bee1012 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double valorA = entrada.nextDouble(), 
        valorB = entrada.nextDouble(), 
        valorC = entrada.nextDouble();
        
        double areaDoTriangulo = (valorA * valorC) / 2, pi = 3.14159,
        areaDoCirculo = (pi * (valorC * valorC)),
        areaDoTrapezio = ((valorA + valorB) * valorC) / 2,
        areaDoQuadrado = valorB * valorB,
        areaDoRerangulo = valorA * valorB;

        System.out.printf(
            "TRIANGULO: %.3f\n" +
            "CIRCULO: %.3f\n" +
            "TRAPEZIO: %.3f\n" +
            "QUADRADO: %.3f\n" +
            "RETANGULO: %.3f\n", 
            areaDoTriangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRerangulo
        );

        entrada.close();
	}
}
