import java.util.Scanner;

public class PositivosEMedia {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        double n, s=0;
        int p=0;
        for (int i=0; i<6; i++) {
            n = SC.nextDouble();
            if (n>0) {
                p++;
                s+=n;
            }
        } System.out.printf("%d valores positivos\n%.1f\n", p, s/p);
    }
}
