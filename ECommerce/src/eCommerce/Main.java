package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.abstracts.AuthService;
import eCommerce.core.concretes.AuthManager;
import eCommerce.core.concretes.UserValidationManager;
import eCommerce.core.concretes.VerificationManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		

		UserService userService = new UserManager(new HibernateUserDao());
		
		AuthService authService = new AuthManager(userService, new VerificationManager(), new UserValidationManager());
		authService.register(1, "Hasan", "Çifçi", "mail@mail.com", "123456"); 
		authService.login("mail@mail.com", "12345");
	}

}
