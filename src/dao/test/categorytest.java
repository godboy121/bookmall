package dao.test;

import bookmal.dao.categoryDao;
import vo.categoryVo;

public class categorytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();

	}
	public static void insert(){
		categoryVo vo=new categoryVo();
		vo.setCategory_num(1);
		vo.setCategory_name("컴퓨터/IT");
		
		categoryDao dao=new categoryDao();
		dao.insert(vo);
	}

}
