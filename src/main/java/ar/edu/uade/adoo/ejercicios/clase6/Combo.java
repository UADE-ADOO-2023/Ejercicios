package ar.edu.uade.adoo.ejercicios.clase6;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private List<Producto> productos;

    public Combo(String nombre) {
        super(nombre);
        this.productos = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        /*
        Double suma = 0D;
        for (int i = 0; i < this.productos.size(); i++) {
            suma += this.productos.get(i).calcularPrecio();
        }
        return suma;
        */
        return this.productos.stream().mapToDouble(Producto::calcularPrecio).sum();
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
}
