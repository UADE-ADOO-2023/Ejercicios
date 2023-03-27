package ar.edu.uade.adoo.ejercicios.clase2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Licencia {
    private String numero;
    private String categoria;
    private LocalDate vencimiento;

    public Licencia(String numero, String categoria, LocalDate vencimiento) {
        this.numero = numero;
        this.categoria = categoria;
        this.vencimiento = vencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public boolean estaVencida() {
        return this.vencimiento.isAfter(LocalDate.now().minusDays(1L));
    }
}
