package servicios;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;

@Service
public class EnviarEmailsService implements InterfazEnviarEmails {
	private final Logger logger;
	
	public EnviarEmailsService(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public boolean enviarEmail(Destinatario dest, String email) {
        logger.info("Enviando email a: " + email);
		return true;
	}

}
