package com.softtek.presentacion;

import com.softtek.modelo.*;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Ordenador", 100);
        Producto producto2 = new Producto("Ratón", 15);


        IImpuesto ivaGeneral = new IvaGeneral();
        IImpuesto ivaSuperReducido = new IvaSuperReducido();


        double impuestoProducto1 = ivaGeneral.calcularImpuesto(producto1);
        double impuestoProducto2 = ivaSuperReducido.calcularImpuesto(producto2);


        System.out.println("Impuesto de producto 1 (IVA General): " + impuestoProducto1);
        System.out.println("Impuesto de producto 2 (IVA Super Reducido): " + impuestoProducto2);
    }
}
