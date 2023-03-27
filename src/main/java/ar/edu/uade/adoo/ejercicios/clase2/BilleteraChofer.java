package ar.edu.uade.adoo.ejercicios.clase2;

public class BilleteraChofer extends BilleteraVirtual{
    private double comision;

    public BilleteraChofer(FormaDePago formaDePago, double comision) {
        super(formaDePago);
        this.comision = comision;
    }

    public BilleteraChofer(FormaDePago formaDePago) {
        super(formaDePago);
    }

    @Override
    public void recargarBilletera(double monto) {
        this.formaDePago.pagar((1 - comision) * monto);
        this.balance += monto;
    }
}
