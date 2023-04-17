package ar.edu.uade.adoo.ejercicios.clase5;

public class Main {
    public static void main(String[] args) {
        AplicacionMensajeria aplicacionMensajeria = new AplicacionMensajeria(new WhatsApp(new AdaptadorWhatsApp()));
        aplicacionMensajeria.enviarNotificacion(new Notificacion("a@uade.edu.ar", "Hola!"));
        aplicacionMensajeria.setMedioNotificacion(new SMS(new AdaptadorTwilio()));
        aplicacionMensajeria.enviarNotificacion(new Notificacion("+5411123456789", "Hola!"));
    }
}
