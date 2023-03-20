package ar.edu.uade.adoo.ejercicios.clase1;

import java.util.ArrayList;
import java.util.List;

public class CajaAhorro extends Cuenta {
    private List<Tarjeta> tarjetas;

    public CajaAhorro(Cliente cliente, Double balance, Integer numeroCuenta) {
        super(cliente, balance, numeroCuenta);
        this.tarjetas = new ArrayList<>();
        this.tarjetas.add(new TarjetaCredito(cliente.getNombreCompleto()));
        this.tarjetas.add(new TarjetaDebito(cliente.getNombreCompleto()));
    }

    @Override
    public void extraer(Double monto) {
        if (this.getBalance() - monto >= 0) {
            super.extraer(monto);
        }
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }
}
