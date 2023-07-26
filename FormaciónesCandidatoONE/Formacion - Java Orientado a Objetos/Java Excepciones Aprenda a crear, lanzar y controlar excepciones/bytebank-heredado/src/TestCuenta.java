
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = null;
        
        int num = 0;
        int resultado = 30/0;
        System.out.println(resultado);
        
        CuentaAhorros cuentaAhorros = new CuentaAhorros(2, 3);
        cuentaCorriente.depositar(2000);
        cuentaCorriente.retirar(500);
//        cuentaCorriente.transferir(1000, cuentaAhorros);
//        
        System.out.println(cuentaCorriente.getSaldo());
//        System.out.println(cuentaAhorros.getSaldo());
        
    }
}
