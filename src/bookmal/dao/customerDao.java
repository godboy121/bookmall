package bookmal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vo.bookVo;
import vo.customerVo;

public class customerDao {
	public void insert(customerVo vo){
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver" );
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			
			conn=DriverManager.getConnection(url,"bitdb","asd");
			//3.statement 객체 생성
			String sql="insert into customer values(?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getCustomer_name());
			pstmt.setString(2, vo.getCustomer_phone_num());
			pstmt.setString(3, vo.getCustomer_email());
			pstmt.setInt(4, vo.getCustomer_passwd());
			
			pstmt.executeUpdate();
			
		
			
			
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패"+e);
		}catch(SQLException e){
			System.out.println("error"+e);
		}finally{
			try{
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
