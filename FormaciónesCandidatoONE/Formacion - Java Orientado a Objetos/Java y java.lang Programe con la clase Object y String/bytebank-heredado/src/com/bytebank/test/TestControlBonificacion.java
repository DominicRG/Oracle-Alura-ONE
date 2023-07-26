package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
        //polimorfismo
        
        Funcionario diego = new Contador();
        diego.setSalario(2000);
        
        Gerente jimena = new Gerente();
        jimena.setSalario(10000);
        
        Contador alexis = new Contador();
        alexis.setSalario(5000);
        
        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexis);
        
    }
}
