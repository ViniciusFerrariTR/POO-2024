import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double n = 3.14159;
        double raio = teclado.nextInt();
        double area = (n * Math.pow(raio,2));

        System.out.printf("A=%.4f%n",area);
    }
}
