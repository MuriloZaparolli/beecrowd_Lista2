import java.util.Scanner;

public class MultiplosDe13 {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = SC.nextInt(), n2 = SC.nextInt(), s=0, ma, mn;
        if (n1 > n2) {
            mn = n2;
            ma = n1;
        } else {
            mn = n1;
            ma = n2;
        } for (int i = mn; i <= ma; i++) {
            if (i % 13 != 0) {
                s+=i;
            }
        } System.out.println(s);
    }
}
