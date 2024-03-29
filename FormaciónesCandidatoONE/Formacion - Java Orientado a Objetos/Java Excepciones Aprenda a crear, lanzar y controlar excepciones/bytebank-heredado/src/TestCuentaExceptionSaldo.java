
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(200);
        try {
            cuenta.retirar(200);
            cuenta.retirar(10);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(TestCuentaExceptionSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
