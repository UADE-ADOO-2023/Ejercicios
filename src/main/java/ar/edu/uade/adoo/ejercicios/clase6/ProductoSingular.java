package ar.edu.uade.adoo.ejercicios.clase6;

public class ProductoSingular extends Producto {
    private Double precio;

    public ProductoSingular(String nombre, Double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        return this.precio;
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new UnsupportedOperationException("No se pueden agregar productos a un producto simple");
    }
}
