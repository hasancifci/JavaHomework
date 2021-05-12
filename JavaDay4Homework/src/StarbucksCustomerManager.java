
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			System.out.println("Saved to db : " + customer.getFirstName());
		}
		else
		{
			System.out.println("Not a valid person");
		}
	}

}
