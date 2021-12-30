package chinhworkshop.Services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhworkshop.DAO.BillsDAO;
import chinhworkshop.DAO.CartDAO;
import chinhworkshop.DTO.BillsDTO;
import chinhworkshop.DTO.CartDTO;

@Service
public class CartService_Imple implements CartService_Interface {
	@Autowired
	CartDAO cartDAO;
	@Autowired
	BillsDAO billsDAO;

	public HashMap<Integer, CartDTO> AddItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.AddItemCart(id, cart);
	}

	public HashMap<Integer, CartDTO> EditItemCart(int id, int Quatity, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.EditItemCart(id, Quatity, cart);
	}

	public HashMap<Integer, CartDTO> SubQuatityItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.SubQuatityItemCart(id, cart);
	}

	public HashMap<Integer, CartDTO> AddQuatityItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.SubQuatityItemCart(id, cart);
	}

	public HashMap<Integer, CartDTO> DeleteItemCart(int id, HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.DeleteItemCart(id, cart);
	}

	public int TotalQuatityBill(HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.TotalQuatityBill(cart);
	}

	public int TotalPriceBill(HashMap<Integer, CartDTO> cart) {
		// TODO Auto-generated method stub
		return cartDAO.TotalPriceBill(cart);
	}

	public int AddBill(BillsDTO bill) {
		// TODO Auto-generated method stub
		return billsDAO.AddBill(bill);
	}

	public List<BillsDTO> GetDataListOrder(int id_user) {
		// TODO Auto-generated method stub
		return billsDAO.GetDataListOrder(id_user);
	}

	}
