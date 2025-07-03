import java.util.Scanner;

public class Resto2 {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = SC.nextInt();
        for (int i=1; i<=10000; i++) {
            if (i%n == 2) {
                System.out.println(i);
            }
        }
    }
}
