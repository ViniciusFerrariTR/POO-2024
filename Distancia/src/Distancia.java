import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int km = teclado.nextInt();
        int resultado = calculaDistancia(km);

        System.out.printf(resultado + " minutos");
    }

    public static int calculaDistancia(int outroKm) {
        return outroKm * 2;
    }
}
    