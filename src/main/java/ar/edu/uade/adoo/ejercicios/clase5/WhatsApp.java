package ar.edu.uade.adoo.ejercicios.clase5;

public class WhatsApp implements IMedioNotificacion{
    private IAdaptadorWhatsApp adaptador;

    public WhatsApp(IAdaptadorWhatsApp adaptador) {
        this.adaptador = adaptador;
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        this.adaptador.enviarWhatsApp(notificacion);
    }
}
