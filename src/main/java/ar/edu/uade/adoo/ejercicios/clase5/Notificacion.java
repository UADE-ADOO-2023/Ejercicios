package ar.edu.uade.adoo.ejercicios.clase5;

public class Notificacion {
    private String destinatario;
    private String cuerpoMensaje;

    public Notificacion(String destinatario, String cuerpoMensaje) {
        this.destinatario = destinatario;
        this.cuerpoMensaje = cuerpoMensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getCuerpoMensaje() {
        return cuerpoMensaje;
    }
}
