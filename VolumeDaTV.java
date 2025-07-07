import java.util.Scanner;

public class VolumeDaTV {
    final static Scanner SC = new Scanner(System.in);

    static int limite(int v) {
        if (v<0) {
            v=0;
        } else if (v>100) {
            v=100;
        } return v;
    }

    public static void main(String[] args) {
        int v, t, m;
        v=SC.nextInt();
        t=SC.nextInt();
        for (int i=0; i<t; i++) {
            m=SC.nextInt();
            v+=m;
            v=limite(v);
        } System.out.println(v);
    }
}
