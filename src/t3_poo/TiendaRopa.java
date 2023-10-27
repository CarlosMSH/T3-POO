/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3_poo;

import java.util.ArrayList;
import java.util.List;

public abstract class TiendaRopa implements GestionPrecio {
    protected List<String> productos;
    protected List<Double> precios;

    public TiendaRopa() {
        productos = new ArrayList<>();
        precios = new ArrayList<>();
    }

    @Override
    public void agregarProducto(String producto, double precio) {
        productos.add(producto);
        precios.add(precio);
    }
}
