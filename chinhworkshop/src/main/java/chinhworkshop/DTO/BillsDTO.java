package chinhworkshop.DTO;

public class BillsDTO {
	private int id_bill;
	private int user_id;
	private String user_name;
	private String phone;
	private String address;
	private int quanity;
	private int totalPriceBill;
	private String note;
	private String date_time;
	
	
	
	public BillsDTO() {
		super();
	}


	public int getId_bill() {
		return id_bill;
	}


	public void setId_bill(int id_bill) {
		this.id_bill = id_bill;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getQuanity() {
		return quanity;
	}



	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}



	public int getTotalPriceBill() {
		return totalPriceBill;
	}



	public void setTotalPriceBill(int totalPriceBill) {
		this.totalPriceBill = totalPriceBill;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}


	public String getDate_time() {
		return date_time;
	}


	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	
	
	

}
