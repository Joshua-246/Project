package pojo;

public class ProductInfo {
	private int producdtId;
	private String productName;
	private String productCategory;
	private int productPrice;
	
	public ProductInfo() {
		super();
	}

	public ProductInfo(int producdtId, String productName, String productCategory, int productPrice) {
		super();
		this.producdtId = producdtId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	public int getProducdtId() {
		return producdtId;
	}

	public void setProducdtId(int producdtId) {
		this.producdtId = producdtId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
