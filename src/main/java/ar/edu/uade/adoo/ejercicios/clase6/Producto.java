package ar.edu.uade.adoo.ejercicios.clase6;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public abstract Double calcularPrecio();

    public abstract void agregarProducto(Producto producto);

    protected String getNombre() {
        return this.nombre;
    }
}
