import java.util.Scanner;

public class Bee3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeMovimentos = sc.nextInt();
		if(2000 >= quantidadeMovimentos || quantidadeMovimentos >= 1){
            char posicaoInicial = Character.toUpperCase(sc.next().charAt(0));
            char posicaoFinal = posicaoInicial;
            
            for(int i = 0; i < quantidadeMovimentos; i++){
                int movimento = sc.nextInt();
                
                if(movimento == 1)
                    if(posicaoFinal == 'A' )
                        posicaoFinal = 'B';
                    else if(posicaoFinal == 'B')
                        posicaoFinal = 'A';
                if(movimento == 2){
                    if(posicaoFinal == 'B')
                        posicaoFinal = 'C';
                    else if(posicaoFinal == 'C')
                        posicaoFinal = 'B';
                }
                if(movimento == 3){
                    if(posicaoFinal == 'A')
                        posicaoFinal = 'C';
                    else if(posicaoFinal == 'C')
                        posicaoFinal = 'A';
                }
            }
        
            System.out.println(posicaoFinal);
		}
	
		sc.close();
	}
}