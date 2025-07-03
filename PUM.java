import java.util.Scanner;

public class PUM {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = SC.nextInt(), x=1;
        for (int i=0; i<n;) {
            if (x%4 == 0) {
                System.out.println("PUM");
                i++;
            } else {
                System.out.printf("%d ", x);
            } x++;
        }
    }
}
