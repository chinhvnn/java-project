/**
 * Một trong những khía cạnh quan tr�?ng của lớp nghiệp vụ (business layer) là lớp truy cập dữ liệu (data access layer) 
để kết nối các dịch vụ (service) với cơ sở dữ liệu (database). Việc truy cập dữ liệu tùy thuộc vào nguồn dữ liệu, 
loại lưu trữ như database, text file, xml file, json file, …Thậm chí nó khác với cách triển khai của nó, 
ví dụ: cú pháp truy vấn SQL khác nhau giữa MySQL, SQL Server, Oracle, … Với mong muốn sẽ không có gì khác biệt khi 
truy cập cơ sở dữ liệu quan hệ, phân tích xml file hay bất kỳ nguồn dữ liệu nào khác, chúng ta có thể áp dụng mẫu 
thiết kế đối tượng truy cập dữ liệu (Data Access Object Pattern– DAO Pattern).
 */

package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.Entity.Slides_mapper;
import chinhworkshop.Entity.Slides_setget;

@Repository
public class SlidesDAO extends BaseDAO {
	public List<Slides_setget> GetsDataSlide() {
		List<Slides_setget> list = new ArrayList<Slides_setget>();
		String sql= "SELECT * FROM slides";
		list = _jbdcTemplate.query(sql, new Slides_mapper());
		return list;
	}
}
