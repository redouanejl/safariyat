package ma.cigma.Safariyat.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UtilisateurUsernameException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UtilisateurUsernameException(String message) {
		super(message);
	}
}
