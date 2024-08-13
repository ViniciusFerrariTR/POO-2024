public class ContaBancaria {
    private Double saldo;
    private Double limite;




    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }    


    public void depositar (Double valor){
        saldo += valor;
    }
    public void sacar (Double valor){
        saldo += valor;
    }
}


