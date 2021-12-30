package chinhworkshop.DTO;

public class ProductsDTO {
	private int id_product ;
	private int  id_brand   ;
	private boolean sale_prd   ;
	private boolean new_prd    ;
	private boolean best_prd   ;
	private String name       ;
	private String detail     ;
	private String img        ;
	private int price      ;
	private int size       ;
	public ProductsDTO() {
		super();
	}
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	public int getId_brand() {
		return id_brand;
	}
	public void setId_brand(int id_brand) {
		this.id_brand = id_brand;
	}
	public boolean isSale_prd() {
		return sale_prd;
	}
	public void setSale_prd(boolean sale_prd) {
		this.sale_prd = sale_prd;
	}
	public boolean isNew_prd() {
		return new_prd;
	}
	public void setNew_prd(boolean new_prd) {
		this.new_prd = new_prd;
	}
	public boolean isBest_prd() {
		return best_prd;
	}
	public void setBest_prd(boolean best_prd) {
		this.best_prd = best_prd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
