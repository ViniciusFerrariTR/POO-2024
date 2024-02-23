import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        int parte1 = (a * b);
        int parte2 = (c * d);

        int diferenca = (parte1 - parte2);

        System.out.printf("DIFERENCA = %d", diferenca);

    }
}
