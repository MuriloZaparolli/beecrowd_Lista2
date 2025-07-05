import java.util.Scanner;

public class Og {
    final static Scanner SC = new Scanner(System.in);

    static int lerQuantFilhos() {
        int i;
        do {
            i=SC.nextInt();
        } while (i<0 || i>5);
        return i;
    } 

    public static void main(String[] args) {
        int l, r;
        while (true) {
            l=lerQuantFilhos();
            r=lerQuantFilhos();
            if (l==0 && r==0) {
                break;
            } System.out.println(l+r);
        }
    }
}
