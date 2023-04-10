
public class Customer1 {
	private int customerId;
	private String customerName;
	private int billAmount;
	
	public Customer1() {
		// TODO Auto-generated constructor stub
	}

	public Customer1(int customerId, String customerName, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return "Customer1 [customerId=" + customerId + ", customerName=" + customerName + ", billAmount=" + billAmount
				+ "]";
	}
	
}
