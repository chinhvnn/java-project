package chinhworkshop.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhworkshop.DAO.BrandsDAO;
import chinhworkshop.DAO.MenusDAO;
import chinhworkshop.DAO.PaginatesDAO;
import chinhworkshop.DAO.ProductsDAO;
import chinhworkshop.DAO.Products_detailDAO;
import chinhworkshop.DAO.Products_filterDAO;
import chinhworkshop.DAO.Products_searchDAO;
import chinhworkshop.DAO.SlidesDAO;
import chinhworkshop.DTO.ProductsDTO;
import chinhworkshop.Entity.Brands_setget;
import chinhworkshop.Entity.Menus_setget;
import chinhworkshop.Entity.Slides_setget;
@Service
public class HomeService_Imple implements HomeService_Interface {

	@Autowired
	private SlidesDAO slidesDAO;
	@Autowired
	private BrandsDAO brandsDAO;
	@Autowired
	private MenusDAO menusDAO;
	@Autowired
	private ProductsDAO productsDAO;
	@Autowired
	private Products_detailDAO products_detailDAO;
	@Autowired
	private Products_searchDAO products_searchDAO;
	@Autowired
	private Products_filterDAO products_filterDAO;
	@Autowired
	private PaginatesDAO paginatesDAO;
	
	public List<Slides_setget> GetsDataSlide() {
		return slidesDAO.GetsDataSlide();
	}

	public List<Brands_setget> GetsDataBrands() {
		return brandsDAO.GetsDataBrands();
	}
	
	public List<Menus_setget> GetsDataMenus() {
		return menusDAO.GetsDataMenus();
	}

	public List<ProductsDTO> GetsAllProducts() {
		return productsDAO.GetsAllProducts();
	}
	public List<ProductsDTO> GetsNewProducts() {
		return productsDAO.GetsNewProducts();
	}
	public List<ProductsDTO> GetsBestProducts() {
		return productsDAO.GetsBestProducts();
	}
	public List<ProductsDTO> GetsSaleProducts() {
		return productsDAO.GetsSaleProducts();
	}
	public List<ProductsDTO> GetsDataProducts(String pageId, String itemPerPage, String sort) {
		return productsDAO.GetsDataProducts(pageId, itemPerPage, sort);
	}
	public List<ProductsDTO> GetDetailProduct(String id_product) {
		return products_detailDAO.GetDetailProduct(id_product);
	}
	public List<ProductsDTO> GetSearchAllProducts(String keyword) {
		return products_searchDAO.GetSearchAllProducts(keyword);
	}
	public List<ProductsDTO> GetSearchProducts(String keyword, String pageId, String itemPerPage, String sort) {
		return products_searchDAO.GetSearchProducts(keyword, pageId, itemPerPage, sort);
	}

	public List<ProductsDTO> FilterProducts(String[] brand, String[] price, String[] size, String pageId,
			String itemPerPage, String sort) {
		return products_filterDAO.FilterProducts(brand, price, size, pageId, itemPerPage, sort);
	}
	public List<ProductsDTO> FilterAllProducts(String[] brand, String[] price, String[] size, String pageId, String itemPerPage, String sort) {
		return products_filterDAO.FilterAllProducts(brand, price, size, pageId, itemPerPage, sort);
	}
	public ArrayList<Integer> totalPagePaginates(int totalPage) {
		return paginatesDAO.totalPagePaginates(totalPage);
	}
	public String urlFilter(String[] brand_str, String[] price_str, String[] size_str) {
		return products_filterDAO.urlFilter(brand_str, price_str, size_str);
	}

}
