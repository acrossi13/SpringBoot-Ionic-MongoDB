package com.adriano.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.adriano.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmation (Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
