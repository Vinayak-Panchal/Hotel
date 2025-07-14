package Customer_Dto;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	public int getId() {
		return customerId;
	}
	public void setId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAddress() {
		return customerAddress;
	}
	public void setAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public Customer() {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	public Customer(int customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
}
