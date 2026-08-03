
public class BillCollector {
	private IPayment payment;
	
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}

	public void payBill(double amount) {
		String pay = payment.pay(amount);
		System.out.println(pay);
	}
	
	
}
