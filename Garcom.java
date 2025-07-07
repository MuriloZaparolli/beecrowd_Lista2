import java.util.Scanner;

public class Garcom {
    final static Scanner SC = new Scanner(System.in);
 
    public static void main(String[] args) {
        int n, l, c, cS=0;
        n=SC.nextInt();
        for (int i=0; i<n; i++) {
            l=SC.nextInt();
            c=SC.nextInt();
            if (l>c) {
                cS+=c;
            }
        } System.out.println(cS);
    }
}
