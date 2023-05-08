package ar.edu.uade.adoo.ejercicios.clase7;

public abstract class Local extends Casa{
    private Casa casa;

    public Local(Casa casa) {
        this.casa = casa;
    }

    public Double calcularValor() {
        return super.calcularValor();
    }
}
