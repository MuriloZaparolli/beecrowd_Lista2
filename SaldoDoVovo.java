import java.util.Scanner;

public class SaldoDoVovo {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n, s, m, mn;
        n = SC.nextInt();
        s = SC.nextInt();
        mn = s;
        for (int i=0; i<n; i++) {
            m=SC.nextInt();
            s+=m;
            if (s<mn) {
                mn=s;
            }
        } System.out.println(mn);
    }
}
