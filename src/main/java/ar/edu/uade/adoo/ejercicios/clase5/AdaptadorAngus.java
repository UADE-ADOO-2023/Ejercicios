package ar.edu.uade.adoo.ejercicios.clase5;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.util.Properties;

public class AdaptadorAngus implements IAdaptadorEmail{
    public void enviarEmail(Notificacion notificacion) {
        try {
            Properties prop = new Properties();
            prop.put("mail.smtp.auth", true);
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.host", "smtp.mailtrap.io");
            prop.put("mail.smtp.port", "25");
            prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
            Session session = Session.getInstance(prop, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("no-reply@miempresa.com", "passresegura");
                }
            });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@miempresa.com"));
            message.setRecipients(
                    Message.RecipientType.TO, InternetAddress.parse(notificacion.getDestinatario()));
            message.setSubject("Mail Subject");

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(notificacion.getCuerpoMensaje(), "text/html; charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            Transport.send(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
