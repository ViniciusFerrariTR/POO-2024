public class Funcionario {
    double salarioBase;
    double totalDeVendas;
    double salarioFinal;

    public void calculaSalario(double salarioBase, double totalDeVendas) {
        this.salarioBase = salarioBase;
        this.totalDeVendas = totalDeVendas;


        if (totalDeVendas >=0 && totalDeVendas<= 10000.00 ) {
            totalDeVendas * 0.1;
        }
    }
}