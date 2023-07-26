
public class pruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.depositar(300);
        miCuenta.depositar(200);
        
        System.out.println(miCuenta.getSaldo());
        
        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());
        
        Cuenta cuentaJimena = new Cuenta();
        cuentaJimena.depositar(1000);
        cuentaJimena.transferir(400, miCuenta);
        
        System.out.println("Cuenta Jimena: "+cuentaJimena.getSaldo());
        System.out.println("mi Cuenta: "+miCuenta.getSaldo());
    }
}
