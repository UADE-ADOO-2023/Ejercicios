package ar.edu.uade.adoo.ejercicios.clase2;

public class BilleteraPasajero extends BilleteraVirtual{
    public BilleteraPasajero(FormaDePago formaDePago) {
        super(formaDePago);
    }

    @Override
    public void recargarBilletera(double monto) {
        this.formaDePago.pagar(monto);
        this.balance += monto;
    }
}
