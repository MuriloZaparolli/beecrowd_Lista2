import java.util.Scanner;

public class NumerosPositivos {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        double n;
        int p=0;
        for (int i=0; i<6; i++) {
            n = SC.nextDouble();
            if (n>0) {
                p++;
            }
        } System.out.printf("%d valores positivos\n", p);
    }
}
