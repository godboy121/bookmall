package dao.test;

import bookmal.dao.customerDao;
import vo.customerVo;

public class customertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();

	}
	public static void insert(){
		customerVo vo=new customerVo();
		vo.setCustomer_name("남달우");
		vo.setCustomer_phone_num("010-9236-4423");
		vo.setCustomer_email("wefaerf@naver.com");
		vo.setCustomer_passwd(1234);
		
		customerDao dao=new customerDao();
		dao.insert(vo);
	}

}
