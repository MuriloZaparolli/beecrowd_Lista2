import java.util.Scanner;

public class Intervalo2 {
    final static Scanner SC = new Scanner(System.in);
    
    static int lerNatural() {
        int v;
        do {
            v = SC.nextInt();
        } while (v < 0);
        return v;
    }

    static int lerX() {
        int x;
        do {
            x = SC.nextInt();
        } while (x < -Math.pow(10, 7) || x > Math.pow(10, 7));
        return x;
    }

    public static void main(String[] args) {
        int n = lerNatural(), in=0, out=0, x;
        for (int i=0; i<n; i++) {
            x = lerX();
            if (x<10 || x>20) {
                out++;
            } else {
                in++;
            }
        } System.out.printf("%d in\n%d out\n", in, out);
    }
}
