import java.util.Scanner;

public class FatorialSimples {
    final static Scanner SC = new Scanner(System.in);
    
    static int lerQuantNum() {
        int v;
        do {
            v = SC.nextInt();
        } while (v <= 0 || v >= 13);
        return v;
    }

    public static void main(String[] args) {
        int n, s=1;
        n = lerQuantNum();
        for (int i=n; i>1; i--) {
            s = s*i;
        } System.out.println(s);
    }
}
