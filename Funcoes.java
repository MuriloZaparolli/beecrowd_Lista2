import java.util.Scanner;

public class Main {
    final static Scanner SC = new Scanner(System.in);

    static int lerNum() {
        int n;
        do {
            n=SC.nextInt();
        } while (n<1 || n>100);
        return n;
    }

    static int funcRafael(int x, int y) {
        int r = (int)Math.pow((3*x), 2)+(int)Math.pow(y, 2);
        return r;
    }

    static int funcBeto(int x, int y) {
        int r = 2*((int)Math.pow(x, 2)) + (int)Math.pow(5*y, 2);
        return r;
    }

    static int funcCarlos(int x, int y) {
        int r = -100*x + (int)Math.pow(y, 3);
        return r;
    }

    public static void main(String[] args) {
        int x, y, n;
        String r;
        n=SC.nextInt();
        for (int i=0; i<n; i++) {
            x=lerNum();
            y=lerNum();
            if (funcRafael(x, y)>funcBeto(x, y) && funcRafael(x, y)>funcCarlos(x, y)) {
                r = "Rafael";
            } else if (funcBeto(x, y)>funcCarlos(x, y)) {
                r = "Beto";
            } else {
                r = "Carlos";
            }System.out.println(r + " ganhou");
        }
    }
}
