package chinhworkshop.DAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class PaginatesDAO {
	public ArrayList<Integer> totalPagePaginates(int totalPage) {

		ArrayList<Integer> pagelist = new ArrayList<Integer>();
		for (int i = 0; i < totalPage; i++) {
			pagelist.add(i + 1);
		}

		return pagelist;
	}

	
}
