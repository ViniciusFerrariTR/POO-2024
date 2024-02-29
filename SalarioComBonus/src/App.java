import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.nextLine();
        double salarioFixo = teclado.nextDouble();
        double totalVendas = teclado.nextDouble();
        
        double salarioComBonus = (salarioFixo + (totalVendas*0.15));

        System.out.printf("TOTAL = R$ %.2f%n", salarioComBonus);
    }


}