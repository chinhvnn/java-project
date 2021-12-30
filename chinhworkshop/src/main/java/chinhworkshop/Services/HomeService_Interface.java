package chinhworkshop.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhworkshop.DTO.ProductsDTO;
import chinhworkshop.Entity.Brands_setget;
import chinhworkshop.Entity.Menus_setget;
import chinhworkshop.Entity.Slides_setget;
@Service
public interface HomeService_Interface {
	@Autowired
	public List<Slides_setget> GetsDataSlide();
	@Autowired
	public List<Brands_setget> GetsDataBrands();
	@Autowired
	public List<Menus_setget> GetsDataMenus();
	@Autowired
	public List<ProductsDTO> GetsAllProducts();
	@Autowired
	public List<ProductsDTO> GetDetailProduct(String id_product);
	@Autowired
	public List<ProductsDTO> GetsDataProducts(String pageId, String itemPerPage, String sort);
	@Autowired
	public List<ProductsDTO> GetSearchAllProducts(String keyword);
	@Autowired
	public List<ProductsDTO> GetSearchProducts(String keyword, String pageId, String itemPerPage, String sort);
	@Autowired
	public List<ProductsDTO> FilterAllProducts(String[] brand, String[] price, String[] size, String pageId, String itemPerPage, String sort);
	@Autowired
	public List<ProductsDTO> FilterProducts(String[] brand, String[] price, String[] size, String pageId, String itemPerPage, String sort);
	@Autowired
	public String urlFilter(String[] brand_str, String[] price_str, String[] size_str);
	@Autowired
	public ArrayList<Integer> totalPagePaginates(int totalPage);
}
