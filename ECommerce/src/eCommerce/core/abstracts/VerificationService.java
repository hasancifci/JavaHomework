package eCommerce.core.abstracts;

import eCommerce.entities.concretes.User;

public interface VerificationService {
	
	boolean verificate(User user);
}
