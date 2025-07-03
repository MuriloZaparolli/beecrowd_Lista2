import java.util.Scanner;

public class ParesImparesPositivosENegativos {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int v, pos=0, neg=0, par=0, imp=0;
        for (int i=0; i<5; i++) {
            v=SC.nextInt();
            if (v>0) {
                pos++;
            } else if (v<0) {
                neg++;
            } if (v%2 == 0) {
                par++;
            } else {
                imp++;
            }
        } System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", par, imp, pos, neg);
    }
}
