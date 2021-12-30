package chinhworkshop.DAO;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import chinhworkshop.DTO.CartDTO;
import chinhworkshop.DTO.ProductsDTO;

@Repository
public class CartDAO extends BaseDAO {
	@Autowired
	ProductsDAO productDAO = new ProductsDAO();

	// ADD ITEM	// ///////////////////////////////////////////////////////////////////////////////////////////
	public HashMap<Integer, CartDTO> AddItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// tao 1 doi tuong hang de check trong Giohang moi
		CartDTO itemCart = new CartDTO();
		// kiem tra product
		ProductsDTO product = productDAO.GetDataProductsByID(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id); // lay item bang cach Get ID tren hashmap da co san item
			int Quatity_1 = itemCart.getQuatity() + 1;
			itemCart.setQuatity(Quatity_1);
			itemCart.setTotalPrice(Quatity_1 * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(product); // lay item = product co id truyen vao
			itemCart.setQuatity(1); // tang so luong item them 1
			itemCart.setTotalPrice(product.getPrice());// lay gia cua item
		}
		cart.put(id, itemCart);// put len hashmap item vua moi cap nhat
		return cart;

	}

	// EDIT ITEM
	// ///////////////////////////////////////////////////////////////////////////////////////////
	public HashMap<Integer, CartDTO> EditItemCart(int id, int Quatity, HashMap<Integer, CartDTO> cart) {
		// tao 1 doi tuong hang de check trong Giohang moi
		CartDTO itemCart = new CartDTO();
		// kiem tra product co trung key khong
		if (cart.containsKey(id)) {
			itemCart = cart.get(id); // lay item bang cach Get ID tren hashmap=cart da co san item
			itemCart.setQuatity(Quatity);
			itemCart.setTotalPrice(Quatity * itemCart.getProduct().getPrice());
		}
		cart.put(id, itemCart);// put len hashmap item vua moi cap nhat
		return cart;
	}

	// SUB ITEM 1
	// ///////////////////////////////////////////////////////////////////////////////////////////
	public HashMap<Integer, CartDTO> SubQuatityItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// tao 1 doi tuong hang de check trong Giohang moi
		CartDTO itemCart = new CartDTO();
		// kiem tra product co trung key khong
		if (cart.containsKey(id)) {
			itemCart = cart.get(id); // lay item bang cach Get ID tren hashmap da co san item
			int Quatity_1 = itemCart.getQuatity() - 1;
			itemCart.setQuatity(Quatity_1);
			itemCart.setTotalPrice(Quatity_1 * itemCart.getProduct().getPrice());
		}
		cart.put(id, itemCart);// put len hashmap item vua moi cap nhat
		return cart;
	}

	// ADD ITEM 1
	// ///////////////////////////////////////////////////////////////////////////////////////////
	public HashMap<Integer, CartDTO> AddQuatityItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// tao 1 doi tuong hang de check trong Giohang moi
		CartDTO itemCart = new CartDTO();
		// kiem tra product co trung key khong
		if (cart.containsKey(id)) {
			itemCart = cart.get(id); // lay item bang cach Get ID tren hashmap da co san item
			int Quatity_1 = itemCart.getQuatity() + 1;
			itemCart.setQuatity(Quatity_1);
			itemCart.setTotalPrice(Quatity_1 * itemCart.getProduct().getPrice());
		}
		cart.put(id, itemCart);// put len hashmap item vua moi cap nhat
		return cart;
	}

	// DELETE ITEM
	// ///////////////////////////////////////////////////////////////////////////////////////////
	public HashMap<Integer, CartDTO> DeleteItemCart(int id, HashMap<Integer, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	// TONG SO LUONG ITEM TRONG BILL
	// ///////////////////////////////////////////////////////////////////////////////////////////
	public int TotalQuatityBill(HashMap<Integer, CartDTO> cart) {
		int val = 0;
		for (Map.Entry<Integer, CartDTO> entry : cart.entrySet()) {
			val += entry.getValue().getQuatity();
		}
		return val;
	}

	// TONG TONG GIA ITEM TRONG BILL
	// ///////////////////////////////////////////////////////////////////////////////////////////
	public int TotalPriceBill(HashMap<Integer, CartDTO> cart) {
		int val = 0;
		for (Map.Entry<Integer, CartDTO> entry : cart.entrySet()) {
			val += entry.getValue().getTotalPrice();
		}
		return val;
	}
}
