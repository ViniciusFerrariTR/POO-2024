import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double parte1 = Math.pow((x2-x1), 2);
        double parte2 = Math.pow((y2-y1), 2);

        double resultado = Math.sqrt(parte1 + parte2);

        System.out.printf("%.4f%n", resultado);

    }
}



