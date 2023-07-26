package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista {

    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta ca2 = new CuentaAhorros(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Guilermo");
        ca2.setTitular(clienteCC2);
        ca2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta ca4 = new CuentaAhorros(72, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Ana");
        ca4.setTitular(clienteCC4);
        ca4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(ca2);
        lista.add(cc3);
        lista.add(ca4);

        System.out.println("Antes de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        //Ordenar las cuentas
        //            Cualquier clase hija de cuenta
        //Comparator <? Extend Cuenta> c
        //Comparator<Cuenta> comparator = new OrdenadorPorNumeroDeCuenta();//Implementacion de la interfaz
        //lista.sort(comparator);
        lista.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });

        System.out.println("Despues de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
        //Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
//        lista.sort(new OrdenadorPorNombreTitular());
//        System.out.println("Por nombre titular");
//        for (Cuenta cuenta : lista) {
//            System.out.println(cuenta);
//        }
        
        Collections.sort(lista, new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
            }
        });        
        System.out.println("Despues de ordenar por nombre de titular");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
        Collections.sort(lista);
        System.out.println("Despues de ordenar por orden natural");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
    }
}

class OrdenadorPorNumeroDeCuenta implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        //Forma basica
//        if (o1.getNumero() == o2.getNumero()) {
//            return 0;
//        } else if (o1.getNumero() > o2.getNumero()) {
//            return 1;
//        } else {
//            return -1;
//        }
//      Forma intermedia
//        return o1.getNumero() - o2.getNumero();
//      Forma Wrapper
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }

}

class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
    }
    
}
