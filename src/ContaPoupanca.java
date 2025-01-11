public class ContaPoupanca extends Conta {
    private int dia;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(int numero, Pessoa correntista, int dia){
        super(numero, correntista);
        this.dia = dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return this.dia;
    }

    public void atualizarSaldo(float juros){
        this.saldo += this.saldo * juros / 100;
    }

}
