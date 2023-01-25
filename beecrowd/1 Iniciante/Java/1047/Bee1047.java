import java.util.Scanner;

public class Bee1047 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
        int minutoInicial = entrada.nextInt() * 60; 
        minutoInicial += entrada.nextInt();
        int minutoFinal = entrada.nextInt() * 60; 
        minutoFinal += entrada.nextInt();
        int variacaoDeTempo = minutoFinal - minutoInicial,
        horasDecorridas = 0, minutosDecorridos = 0;
        
        if (variacaoDeTempo > 1) { // pd ser uma format. em hrs. e mins. ou so mins..
            if (variacaoDeTempo > 60) {// deve ser contabilizado hrs. e mins..
                horasDecorridas = variacaoDeTempo / 60; // retorna o tempo em horas
                minutosDecorridos = variacaoDeTempo % 60; // retorna o tempo em minutos
            } else // caso contrario deve ser contabilizado apenas os minutos
                minutosDecorridos = variacaoDeTempo;
        } else { // pode ser 24h ou outro caso
            if (variacaoDeTempo == 0)
                horasDecorridas = 24;
            else { // calcula-se o intervalo ate meia noite e depois soma com o resto
                int intervaloAteMeiaNoite = (24 * 60) - minutoInicial,
                resultadoEmMinutos = intervaloAteMeiaNoite + minutoFinal;
                
                horasDecorridas = resultadoEmMinutos / 60;
                minutosDecorridos = resultadoEmMinutos % 60;
            }
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 
        horasDecorridas,
        minutosDecorridos);
        
		entrada.close();
	}
}