package ar.edu.uade.adoo.ejercicios.clase5;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import static com.twilio.example.Example.ACCOUNT_SID;
import static com.twilio.example.Example.AUTH_TOKEN;

public class AdaptadorTwilio implements IAdaptadorWhatsApp, IAdaptadorSMS {
    public AdaptadorTwilio() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void enviarSMS(Notificacion notificacion) {
        Message
                .creator(
                        new PhoneNumber(notificacion.getDestinatario()),
                        new PhoneNumber("+15017250604"),
                        notificacion.getCuerpoMensaje()
                )
                .create();
    }

    public void enviarWhatsApp(Notificacion notificacion) {
        Message.creator(
                        new com.twilio.type.PhoneNumber(String.format("whatsapp:%s", notificacion.getDestinatario())),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        notificacion.getCuerpoMensaje())
                .create();
    }
}
