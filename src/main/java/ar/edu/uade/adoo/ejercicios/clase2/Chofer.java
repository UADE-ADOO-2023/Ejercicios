package ar.edu.uade.adoo.ejercicios.clase2;

public class Chofer extends Usuario {
    public Chofer(String nombre, String apellido, String mail, FormaDePago formaDePago, Licencia licencia) {
        super(nombre, apellido, mail);
        if (licencia == null) {
            throw new SinLicenciaException();
        }
        if (licencia.estaVencida()) {
            throw new LicenciaVencidaException();
        }
        this.billeteraVirtual = new BilleteraChofer(formaDePago);
    }
}
