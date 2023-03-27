package ar.edu.uade.adoo.ejercicios.clase2;

public class TarjetaCredito extends FormaDePago {
    @Override
    public void pagar(Double monto) {
        System.out.printf("Pago con credito %f", monto);
    }
}
