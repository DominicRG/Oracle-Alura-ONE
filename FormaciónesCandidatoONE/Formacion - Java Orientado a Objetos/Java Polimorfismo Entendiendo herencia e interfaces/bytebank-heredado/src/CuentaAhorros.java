
public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    
}
