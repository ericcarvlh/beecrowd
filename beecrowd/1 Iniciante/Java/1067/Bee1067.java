import java.util.Scanner;

public class Bee1067 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		if (numero >= 1 && numero <= 1000) {
            int index = 1;
            while (index <= numero) {
                if (index % 2 == 1)
                    System.out.printf("%d\n", index);
                index++;
            }
		}
		
		entrada.close();
	}
}