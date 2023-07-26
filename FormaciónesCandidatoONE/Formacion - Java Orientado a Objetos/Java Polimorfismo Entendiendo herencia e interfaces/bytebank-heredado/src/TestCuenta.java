
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1, 1);
        CuentaAhorros cuentaAhorros = new CuentaAhorros(2, 3);
        cuentaCorriente.depositar(2000);
        cuentaCorriente.retirar(500);
//        cuentaCorriente.transferir(1000, cuentaAhorros);
//        
        System.out.println(cuentaCorriente.getSaldo());
//        System.out.println(cuentaAhorros.getSaldo());
        
    }
}
