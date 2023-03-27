package ar.edu.uade.adoo.ejercicios.clase2;

public abstract class Usuario {
    protected BilleteraVirtual billeteraVirtual;
    private String nombre;
    private String apellido;
    private String mail;

    public Usuario(String nombre, String apellido, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }
}
