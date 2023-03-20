package ar.edu.uade.adoo.ejercicios.clase1;

import java.time.LocalDate;

public abstract class Tarjeta {
    private String emisor;
    private LocalDate vencimiento;
    private String numero;

    public Tarjeta(String emisor, LocalDate vencimiento, String numero) {
        this.emisor = emisor;
        this.vencimiento = vencimiento;
        this.numero = numero;
    }
}
