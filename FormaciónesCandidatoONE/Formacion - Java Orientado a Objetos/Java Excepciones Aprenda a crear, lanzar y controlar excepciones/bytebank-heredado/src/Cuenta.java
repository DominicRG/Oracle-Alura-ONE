
public abstract class Cuenta {
    
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;

    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta");
        
        Cuenta.total++;
    }
    
    public Cuenta(int agencia){
        
        if(agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else{
            this.agencia =  agencia;
        }
        total++;
        System.out.println("Se van crendo: "+total+" cuentas");
    }
    
    public abstract void depositar(double saldo);
    
    public void retirar(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >=  valor){
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException ex) {
                ex.printStackTrace();
            }
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
       
}
