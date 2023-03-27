package ar.edu.uade.adoo.ejercicios.clase2;

public class Pasajero extends Usuario{
    public Pasajero(String nombre, String apellido, String mail, FormaDePago formaDePago) {
        super(nombre, apellido, mail);
        this.billeteraVirtual = new BilleteraPasajero(formaDePago);
    }
}
