package ar.edu.uade.adoo.ejercicios.clase1;

public class CuentaCorriente extends Cuenta {
    private Double limiteDescubierto;

    public CuentaCorriente(Cliente cliente, Double balance, Integer numeroCuenta) {
        super(cliente, balance, numeroCuenta);
        this.limiteDescubierto = 1000D;
    }

    @Override
    public void extraer(Double monto) {
        if ((this.getBalance() + this.limiteDescubierto) - monto >= 0) {
            super.extraer(monto);
        }
    }
}
