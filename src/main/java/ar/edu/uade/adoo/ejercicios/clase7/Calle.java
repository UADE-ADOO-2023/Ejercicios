package ar.edu.uade.adoo.ejercicios.clase7;

public class Calle extends Local{
    private Double montoFijo;

    public Calle(Casa casa, Double montoFijo) {
        super(casa);
        this.montoFijo = montoFijo;
    }

    @Override
    public Double calcularValor() {
        return super.calcularValor() + montoFijo;
    }
}
