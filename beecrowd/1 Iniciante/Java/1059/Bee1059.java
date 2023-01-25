public class Bee1059 {
    public static void main(String[] args) {
        int index = 0;
        while (index < 100) {
            if ((index+1) % 2 == 0)
                System.out.printf("%d\n", (index+1));
            index++;
        }
    }
}
