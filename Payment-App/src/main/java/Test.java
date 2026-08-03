
public class Test {
	public static void main(String[] args) {
		BillCollector bill=new BillCollector();
		bill.setPayment(new DebitCard());
		bill.payBill(1600);
	}
}
