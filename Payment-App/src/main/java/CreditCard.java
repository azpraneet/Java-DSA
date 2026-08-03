
public class CreditCard implements IPayment {

	@Override
	public String pay(double amount) {
		
		return "Payment SuccesssFul through CreditCard";
	}
	
}
