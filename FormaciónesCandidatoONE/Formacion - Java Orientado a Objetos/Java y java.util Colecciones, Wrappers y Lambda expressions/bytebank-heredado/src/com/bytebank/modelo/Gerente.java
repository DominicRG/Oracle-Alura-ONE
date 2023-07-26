package com.bytebank.modelo;

public class Gerente extends Funcionario implements Aunteticable{
    
    private String clave;
    
    @Override
    public double getBonificacion(){
        System.out.println("Ejecutando desde gerente");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean inciarSesion(String clave) {
        if(clave == "AluraCursosOnline"){
            System.out.println("Sesion iniciada correctamente");
            return true;
        }else{
            System.out.println("Psw incorrecto");
            return false;
        }
    }
}
