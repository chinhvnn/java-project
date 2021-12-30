package chinhworkshop.DTO;

public class CartDTO {
	private int idCart;
	private ProductsDTO product;
	private int quatity;
	private int totalPrice;
	
	
	
	public CartDTO() {
		super();
	}
	public int getIdCart() {
		return idCart;
	}
	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}
	public ProductsDTO getProduct() {
		return product;
	}
	public void setProduct(ProductsDTO itemCart) {
		this.product = itemCart;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
