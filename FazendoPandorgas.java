import java.util.Scanner;

public class FazendoPandorgas {
    final static Scanner SC = new Scanner(System.in);

    static int lerXeY() {
        int v;
        do {
            v=SC.nextInt();
        } while (v<10 || v>100);
        return v;
    } 
        
    public static void main(String[] args) {
        int x, y, n;
        n=SC.nextInt();
        for (int i=0; i<n; i++) {
            x=lerXeY();
            y=lerXeY();
            System.out.printf("%d cm2\n", (x*y)/2);
        }
    }
}
