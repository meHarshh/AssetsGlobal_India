package org.assetsglobal.mailservice;

import java.util.Date;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class MailService {
	private JavaMailSender javaMailSender;

	public MailService(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}

	public void sendMailMessage(MessageModel messageModel) throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setTo(messageModel.getTo());
		helper.setSubject(messageModel.getSubject());
		helper.setSentDate(new Date());
		helper.setText(messageModel.getText(), true);

		javaMailSender.send(message);
	}
}