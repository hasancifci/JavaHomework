package eCommerce.core.concretes;

import eCommerce.core.abstracts.AuthService;

public class GoogleAuthenticationManagerAdapter implements AuthService{

	GoogleAuthenticationManagerAdapter manager=new GoogleAuthenticationManagerAdapter();
	
	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		manager.register(id,firstName,lastName,email,password);
		System.out.println("Google hesabý ile kayýt baþarýlý. : " + email);
		
	}

	@Override
	public void login(String email, String password) {
		manager.login(email, password);
		System.out.println("Google hesabý ile giriþ yapýldý. : " + email);
		
	}

}
