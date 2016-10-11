package bookmal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vo.categoryVo;

public class categoryDao {
	public void insert(categoryVo vo){
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver" );
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			
			conn=DriverManager.getConnection(url,"bitdb","asd");
			//3.statement 객체 생성
			
			String sql=	"insert into CATEGORY values(?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,vo.getCategory_num());
			pstmt.setString(2,vo.getCategory_name() );
			
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
