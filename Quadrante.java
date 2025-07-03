import java.util.Scanner;

public class Quadrante {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        String q;
        while (true) {
            x = SC.nextInt();
            y = SC.nextInt();
            if (x==0||y==0) {
                break;
            } if (x > 0 && y > 0) {
                q = "primeiro";
            } else if (x > 0 && y < 0) {
                q = "quarto";
            } else if (x < 0 && y > 0) {
                q = "segundo";
            } else {
                q = "terceiro";
            } System.out.println(q);
        }
    }
}
