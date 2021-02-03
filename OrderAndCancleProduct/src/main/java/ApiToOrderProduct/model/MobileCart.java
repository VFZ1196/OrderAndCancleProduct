package ApiToOrderProduct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class MobileCart {
	
	@Id
	@GeneratedValue
	private int id;
	private String category;
	private String mobileType;
	private float price;
	private int orderId;
	private boolean isPlaced;
	
	public MobileCart() {
		
	}

	public MobileCart(String category, String mobileType, float price, int orderId, boolean isPlaced) {
		super();
		this.category = category;
		this.mobileType = mobileType;
		this.price = price;
		this.orderId = orderId;
		this.isPlaced = isPlaced;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public boolean isPlaced() {
		return isPlaced;
	}

	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}

}
