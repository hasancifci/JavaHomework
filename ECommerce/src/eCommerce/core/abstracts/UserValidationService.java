package eCommerce.core.abstracts;

import eCommerce.entities.concretes.User;

public interface UserValidationService {
	
	boolean registerValidate(User user);
	boolean loginValidate(String email, String password);
}
