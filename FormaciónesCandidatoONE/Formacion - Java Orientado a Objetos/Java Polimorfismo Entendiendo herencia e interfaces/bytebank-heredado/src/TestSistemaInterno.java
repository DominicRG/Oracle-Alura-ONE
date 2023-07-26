
public class TestSistemaInterno {

    public static void main(String[] args) {
        SistemaInterno sistemaInterno = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador administrador1 = new Administrador();
        sistemaInterno.auntetica(gerente1);
        sistemaInterno.auntetica(administrador1);
    }

}
