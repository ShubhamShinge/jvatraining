//Model Class-POJO (Plain old java objects)-Entity.
//for sorting purpose we are implenting Comparable interface. and overriding compareTo method.
public class Product implements Comparable<Product>{
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	public Product() {
		// TODO Auto-generated constructor stub
		System.out.println("Please Set Product Fields");
	}
	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		if(quantityOnHand<0)
			//throw keyword will raise/ bring the exception
			throw new NegativeQOHException("Quantity cannot be negative");
		this.quantityOnHand = quantityOnHand;
		if(price<0)
			throw new NegativePriceException("Price cannot be negative");
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}
	
	//Will sort products list created in CustomDatatypeIteratorDemo based on price.
	@Override
	public int compareTo(Product o) {
		if(this.price > o.price)
			return 0;
		else 
			return -1;
	}
	
	
}
