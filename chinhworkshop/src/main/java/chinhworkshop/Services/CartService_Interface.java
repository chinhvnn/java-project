package chinhworkshop.Services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhworkshop.DTO.BillsDTO;
import chinhworkshop.DTO.CartDTO;

@Service
public interface CartService_Interface {
	@Autowired
	public HashMap<Integer, CartDTO> AddItemCart(int id, HashMap<Integer, CartDTO> cart);
	@Autowired
	public HashMap<Integer, CartDTO> EditItemCart(int id, int Quatity, HashMap<Integer, CartDTO> cart);
	@Autowired
	public HashMap<Integer, CartDTO> SubQuatityItemCart(int id, HashMap<Integer, CartDTO> cart);
	@Autowired
	public HashMap<Integer, CartDTO> AddQuatityItemCart(int id, HashMap<Integer, CartDTO> cart);
	@Autowired
	public HashMap<Integer, CartDTO> DeleteItemCart(int id, HashMap<Integer, CartDTO> cart);
	@Autowired
	public int TotalQuatityBill(HashMap<Integer, CartDTO> cart);
	@Autowired
	public int TotalPriceBill(HashMap<Integer, CartDTO> cart);
	
	@Autowired
	public int AddBill(BillsDTO bill);

	@Autowired
	public List<BillsDTO> GetDataListOrder(int id_user);
	
}
