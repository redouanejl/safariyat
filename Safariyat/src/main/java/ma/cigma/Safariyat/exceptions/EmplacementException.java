package ma.cigma.Safariyat.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmplacementException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmplacementException(String message) {
		super(message);
	}
}
