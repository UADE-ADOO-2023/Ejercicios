package ar.edu.uade.adoo.ejercicios.clase2;

public class PayPal extends FormaDePago{

    @Override
    public void pagar(Double monto) {
        System.out.printf("Pago con PayPal %f", monto);
    }
}
