package com.bytebank.modelo;


public class SistemaInterno {
    
    String clave = "AluraCursosOnline";
    
    public boolean auntetica(Aunteticable gerente){
        boolean puedeIniciarSesion = gerente.inciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }else{
            System.out.println("Error en el login");
            return false;
        }
    }
}
