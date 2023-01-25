import java.util.Scanner;

public class Bee2006 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tipoDeCha = entrada.nextInt(), index = 0, acertos = 0;
		while (index < 5) {
		    int resposta = entrada.nextInt();
		    if (resposta == tipoDeCha)
		        acertos++;
		    index++;
		}
		
		System.out.println(acertos);
		
		entrada.close();
	}
}