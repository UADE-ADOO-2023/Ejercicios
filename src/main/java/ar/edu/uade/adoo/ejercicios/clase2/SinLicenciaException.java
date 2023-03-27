package ar.edu.uade.adoo.ejercicios.clase2;

public class SinLicenciaException extends RuntimeException {
    public SinLicenciaException() {
        super("El chofer necesita la licencia");
    }
}
