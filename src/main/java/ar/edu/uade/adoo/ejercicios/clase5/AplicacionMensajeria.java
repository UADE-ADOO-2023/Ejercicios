package ar.edu.uade.adoo.ejercicios.clase5;

//Contexto
public class AplicacionMensajeria {
    private IMedioNotificacion medioNotificacion;

    public AplicacionMensajeria(IMedioNotificacion medioNotificacion) {
        this.medioNotificacion = medioNotificacion;
    }

    public void setMedioNotificacion(IMedioNotificacion medioNotificacion) {
        this.medioNotificacion = medioNotificacion;
    }

    public void enviarNotificacion(Notificacion notificacion) {
        this.medioNotificacion.enviarNotificacion(notificacion);
    }
}
