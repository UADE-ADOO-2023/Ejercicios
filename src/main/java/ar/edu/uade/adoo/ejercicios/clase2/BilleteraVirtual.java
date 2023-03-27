package ar.edu.uade.adoo.ejercicios.clase2;

public abstract class BilleteraVirtual {
    protected double balance = 0;
    protected FormaDePago formaDePago;

    public BilleteraVirtual(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public abstract void recargarBilletera(double monto);
}
