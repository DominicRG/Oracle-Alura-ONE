
public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia, int numero){
        super(agencia, numero);
    }
    
    @Override
    public boolean retirar(double valor){
        double comision = 0.2;
        return super.retirar(valor + comision);
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }
}
