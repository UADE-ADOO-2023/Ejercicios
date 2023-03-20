package ar.edu.uade.adoo.ejercicios.clase1;

import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta{
    private Double limiteCompra;
    public TarjetaCredito(String emisor) {
        super(emisor, LocalDate.now().plusYears(5), "1234-5678-9101-1213");
        this.limiteCompra = 150000D;
    }
}
