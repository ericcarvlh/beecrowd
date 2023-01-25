import java.util.Scanner; 

public class Bee1168 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosTeste = sc.nextInt();
        
        if(2000 >= casosTeste || casosTeste >= 1){
            String leds = "";
            
            for (int y = 0; y < casosTeste; y++){
                int totalLeds = 0;
                String valorVeri = sc.next();
                char valorEmArray[] = valorVeri.toCharArray();
                
                for(int x = 0; x < valorEmArray.length; x++){
                    int num = valorEmArray[x];
                    if(num == '9' || num == '0' || num == '6')
                        totalLeds += 6;
                    else if(num == '2' || num == '3' || num == '5')
                        totalLeds += 5;
                    else if(num == '1')
                        totalLeds += 2;
                    else if(num == '4')
                        totalLeds += 4;
                    else if(num == '7')
                        totalLeds += 3;
                    else
                        totalLeds += 7;
                }
                leds += totalLeds+" leds\n";
            }     
            System.out.print(leds);
        }
        
		sc.close();
	}
}