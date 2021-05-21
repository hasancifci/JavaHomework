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
				+ " adresine bir dogrulama kodu gönderildi. Hesabýnýzo onaylamak istiyor musunuz? (E/H)");
		chosenValue = scanner.next().charAt(0);

		if (chosenValue == 'e' || chosenValue == 'E') {
			Random random = new Random();
			int randomInteger, enteredNumber, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						"Hesabýnýzý dogrulamak  için mailinize gelen 6 haneli þifreyi giriniz:\n--> " + randomInteger);
				enteredNumber = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"Çok sayýda hatalý giriþ yaptýnýz, hesap doðrulanamadý. \n Lütfen daha sonra tekrar deneyiniz..");
					scanner.close();
					return false;
				}
			} while (!(enteredNumber == randomInteger) && count < 4);
			System.out.println("Hesap dogrulandý. ");
			
			scanner.close();
			return true;

		}
		scanner.close();
		return false;
	}

}
