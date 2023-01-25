import java.util.Scanner;

public class Bee1041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) 
			System.out.println("Origem");
		if((x > 0.0 || x < 0.0) && y == 0.0)
			System.out.println("Eixo X");
		if((y > 0.0 || y < 0.0) && x == 0.0)
			System.out.println("Eixo Y");
		if(y > 0){
			if(x > 0)
				System.out.println("Q1");
			else if(x < 0 )
				System.out.println("Q2");
		}
		if(y < 0){
			if(x < 0)
				System.out.println("Q3");
			else if(x > 0)
				System.out.println("Q4");
		}
		
		sc.close();
	}
}
