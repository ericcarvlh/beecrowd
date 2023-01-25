import java.util.Scanner;

public class Bee1046 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt(),
        horaFinal = entrada.nextInt(),
        horasDecorridas = 0;

        int intervaloDeTempo = horaFinal - horaInicial;
        if (intervaloDeTempo < 0)
            horasDecorridas = ((24 - horaInicial) + horaFinal);
        else {
            if (intervaloDeTempo == 0)
                horasDecorridas = 24;
            else 
                horasDecorridas = intervaloDeTempo;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", horasDecorridas);

        entrada.close();
	}
}