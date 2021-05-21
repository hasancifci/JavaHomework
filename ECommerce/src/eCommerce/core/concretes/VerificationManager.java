package eCommerce.core.concretes;

import java.util.Random;
import java.util.Scanner;

import eCommerce.core.abstracts.VerificationService;
import eCommerce.entities.concretes.User;

public class VerificationManager implements VerificationService{

	@Override
	public boolean verificate(User user) {
		Scanner scanner = new Scanner(System.in);
		char chosenValue = 'h';
		System.out.println(user.getEmail()
				+ " adresine bir dogrulama kodu g�nderildi. Hesab�n�zo onaylamak istiyor musunuz? (E/H)");
		chosenValue = scanner.next().charAt(0);

		if (chosenValue == 'e' || chosenValue == 'E') {
			Random random = new Random();
			int randomInteger, enteredNumber, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						"Hesab�n�z� dogrulamak  i�in mailinize gelen 6 haneli �ifreyi giriniz:\n--> " + randomInteger);
				enteredNumber = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"�ok say�da hatal� giri� yapt�n�z, hesap do�rulanamad�. \n L�tfen daha sonra tekrar deneyiniz..");
					scanner.close();
					return false;
				}
			} while (!(enteredNumber == randomInteger) && count < 4);
			System.out.println("Hesap dogruland�. ");
			
			scanner.close();
			return true;

		}
		scanner.close();
		return false;
	}

}
