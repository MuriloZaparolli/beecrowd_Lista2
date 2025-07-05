import java.util.Scanner;

public class FibonacciFacil {
    final static Scanner SC = new Scanner(System.in);
    
    static int lerQuantNum() {
        int v;
        do {
            v = SC.nextInt();
        } while (v <= 0 || v >= 46);
        return v;
    }

    public static void main(String[] args) {
        int n1=0, n2=1, n3=1, n, ctrl;
        n=lerQuantNum();
        if (n==1) {
            System.out.println(0);
        } else {
            System.out.printf("0 ");
            for (int i=0; i<n-1; i++) {
                if (i == n-2) {
                    System.out.println(n3);
                } else {
                    System.out.printf("%d ", n3);
                }
                n3 = n1+n2;
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
