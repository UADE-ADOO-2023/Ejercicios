package ar.edu.uade.adoo.ejercicios.clase6;

public abstract class Decorator extends Producto{
    private Producto producto;

    public Decorator(Producto producto) {
        super(producto.getNombre());
        this.producto = producto;
    }

    @Override
    public Double calcularPrecio() {
        return this.producto.calcularPrecio();
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new UnsupportedOperationException("Los decoradores no pueden agregar productos");
    }
}
