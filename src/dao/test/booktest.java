package dao.test;

import bookmal.dao.bookDao;
import vo.bookVo;

public class booktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();
		

	}
	public static void insert(){
		bookVo vo=new bookVo();
		vo.setBook_num(1);
		vo.setBook_name("토지");
		vo.setBook_price("12000원");
		vo.setCategory_num(1);
		
		bookDao dao=new bookDao();
		dao.insert(vo);
	}

}
