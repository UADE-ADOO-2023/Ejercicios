package ar.edu.uade.adoo.ejercicios.clase6;

public class DescuentoDecorator extends Decorator {
    private Double descuento;

    public DescuentoDecorator(Producto producto, Double descuento) {
        super(producto);
        this.descuento = descuento;
    }

    @Override
    public Double calcularPrecio() {
        return super.calcularPrecio() * (1 - this.descuento);
    }
}
