package eCommerce.core.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.AuthService;
import eCommerce.core.abstracts.UserValidationService;
import eCommerce.core.abstracts.VerificationService;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService{

	UserService userService;
	UserValidationService userValidationService;
	VerificationService verificationService;
	
	public AuthManager() {
		
	}
	
	public AuthManager(UserService userService,VerificationService verificationService,UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.verificationService=verificationService;
		this.userValidationService=userValidationService;

	}
	
	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User userToRegister = new User(id, firstName, lastName, email, password);
		if(!this.userValidationService.registerValidate(userToRegister))
		{
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
		
		if(!checkIfUserExists(email))
		{
			System.out.println("Sisteme daha önce kayýtlý e-mail girdiniz. Lütfen kontrol ediniz.");
			return;
		}
		if (!this.verificationService.verificate(userToRegister)) {
			System.out.println("Doðrulama hatalý...");
			return;
		}

		userService.add(userToRegister);
		
	}

	@Override
	public void login(String email, String password) {
		if(!this.userValidationService.loginValidate(email, password))
		{
			System.out.println("Giriþ bilgilerinizi kontrol ediniz.");
			return;
		}
		User userToLogin=userService.getByEmailAndPassword(email, password);
		
		if (userToLogin == null) {
			System.out.println("E-posta veya þifre hatalý");
			return;
		}
		if(!checkIfUserVerified(userToLogin)) 
		{
			System.out.println("Doðrulama hatasý");
			return;
		}
		System.out.println("Giriþ baþarýlý " + userToLogin.getFirstName() + " " + userToLogin.getLastName());
		
	}
	

	private boolean checkIfUserVerified(User user) {
		return verificationService.verificate(user);
	}

	private boolean checkIfUserExists(String email) {
		return userService.getByMail(email)==null;
	}

}
