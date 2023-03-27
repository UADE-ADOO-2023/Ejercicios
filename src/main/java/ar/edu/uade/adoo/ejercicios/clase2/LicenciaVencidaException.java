package ar.edu.uade.adoo.ejercicios.clase2;

public class LicenciaVencidaException extends RuntimeException {
    public LicenciaVencidaException() {
        super("La licencia esta vencida");
    }
}
