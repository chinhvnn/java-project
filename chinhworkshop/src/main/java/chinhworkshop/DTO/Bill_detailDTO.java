package chinhworkshop.DTO;

public class Bill_detailDTO {
	
	
	private int id_bill_detail;
	private int id_product;
	private int id_bill;
	private int quatity;
	private int total;
	public int getId_bill_detail() {
		return id_bill_detail;
	}
	public void setId_bill_detail(int id_bill_detail) {
		this.id_bill_detail = id_bill_detail;
	}
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	public int getId_bill() {
		return id_bill;
	}
	public void setId_bill(int id_bill) {
		this.id_bill = id_bill;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Bill_detailDTO() {
		super();
	}
	
	
	
	
	
	
	

}
