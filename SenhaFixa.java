import java.util.Scanner;

public class SenhaFixa {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SC.nextInt();
        while (n != 2002) {
            System.out.println("Senha Invalida");
            n = SC.nextInt();
        } System.out.println("Acesso Permitido");
    }
}
