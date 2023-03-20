package ar.edu.uade.adoo.ejercicios.clase1;

import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta{
    private Double limiteDiario;
    public TarjetaDebito(String emisor) {
        super(emisor, LocalDate.now().plusYears(5), "1234-5678-9101-1213");
        this.limiteDiario = 150000D;
    }
}
