import java.util.Scanner;

public class Bee1332 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int quantidade = sc.nextInt();
        
        String palavra[] = new String[quantidade+1];
        String numeros = "";

        for(int i = 0; i < palavra.length; i++){
            palavra[i] = sc.nextLine();
            
            if(palavra[i].length() != 0){
                if(palavra[i].length() == 5)
                    numeros += "3\n";
                else{
                    String priL = palavra[i], segL = palavra[i], terL = palavra[i];
                    priL = priL.substring(0, 1);
                    segL = segL.substring(1, 2);
                    terL = terL.substring(2, 3);
                    if(priL.equals("t") && segL.equals("w"))
                        numeros += "2\n";
                    else if(segL.equals("w") && terL.equals("o"))
                        numeros += "2\n";
                    else if(priL.equals("t") && terL.equals("o"))
                        numeros += "2\n";
                    else if(priL.equals("o") && segL.equals("n"))
                        numeros += "1\n";
                    else if(segL.equals("n") && terL.equals("e"))
                        numeros += "1\n";
                    else if(priL.equals("o") && terL.equals("e"))
                        numeros += "1\n";
                }
            }
        }
        
        System.out.print(numeros);
        sc.close();
	}
}