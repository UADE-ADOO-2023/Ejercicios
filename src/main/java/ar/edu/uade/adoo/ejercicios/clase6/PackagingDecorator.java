package ar.edu.uade.adoo.ejercicios.clase6;

public class PackagingDecorator extends Decorator {
    private Double valorPackaging;

    public PackagingDecorator(Producto producto, Double valorPackaging) {
        super(producto);
        this.valorPackaging = valorPackaging;
    }

    @Override
    public Double calcularPrecio() {
        return super.calcularPrecio() + this.valorPackaging;
    }
}
