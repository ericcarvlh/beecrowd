import java.util.Scanner;

public class Bee1847 {
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        int temp[] = new int[3];
        
        temp[0] = sc.nextInt(); temp[1] = sc.nextInt(); temp[2] = sc.nextInt();
            
        if(temp[0] > temp[1]){
            if(temp[1] <= temp[2])
                System.out.println(":)");
            else if (temp[1] > temp[2]){
                if((temp[1] - temp[2]) < (temp[0] - temp[1]))
                    System.out.println(":)");
                else if((temp[1] - temp[2]) >= (temp[0] - temp[1]))
                    System.out.println(":(");
            }
        } else if(temp[0] < temp[1]){
            if(temp[1] >= temp[2])
                System.out.println(":(");
            if(temp[1] < temp[2]){
                if((temp[2] - temp[1]) < (temp[1] - temp[0]))
                    System.out.println(":(");
                else if((temp[2] - temp[1]) >= (temp[1] - temp[0]))
                    System.out.println(":)");
            }
        } else {
            if(temp[1] < temp[2])
                System.out.println(":)");
            else
                System.out.println(":(");
        }
        sc.close();
	}
}