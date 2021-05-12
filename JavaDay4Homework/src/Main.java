import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Hasan","Çifçi",LocalDate.of(1998,12,26),"17915692640"));

	}

}
