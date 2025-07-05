import java.util.Scanner;

public class Idades {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int i, p=0, s=0;
        while (true) {
            i = SC.nextInt();
            if (i<0) {
                break;
            }
            p++;
            s+=i;
        } System.out.printf("%.2f\n", (double)s/p);
    }
}
