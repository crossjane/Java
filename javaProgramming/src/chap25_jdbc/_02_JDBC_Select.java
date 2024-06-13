package chap25_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDBC를 이용해서 과목별 기말고사의 평균 성적 조회
		//(과목번호, 과목이름, 교수번호, 교수이름, 기말고사 성적의 평균점수)
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Connection 객체 얻기 
			conn= JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##study", "!dkdlxl1234");
			//Statement 객체 얻기 
			stmt = conn.createStatement();
			//쿼리문 작성
			String selectAvgInfo = "SELECT C.CNO"
					+ "					, C.CNAME"
					+ "					, P.PNO"
					+ "					, P.PNAME"
					+ "					, ROUND(AVG(SC.RESULT),2) AS RES"
					+ "					 FROM COURSE C"
					+ "					 JOIN SCORE SC"
					+ "  				 ON C.CNO = SC.CNO"
					+ "					 JOIN PROFESSOR P"
					+ "					 ON P.PNO = C.PNO"
					+ "					GROUP BY C.CNO, C.CNAME, P.PNO, P.PNAME";
			
			rs = stmt.executeQuery(selectAvgInfo);
			
			while(rs.next()) {
				
				String cno = rs.getString("cno");
				String cname = rs.getString("cname");
				String pno = rs.getString("pno");
				String pname = rs.getString("pname");
				Double res = rs.getDouble("res");
				
			
				System.out.println("과목번호 " + cno + "과목이름 : " + cname + 
						"교수번호 : " + pno + "교수이름 : " + pname + ", 기말고사평균점수: " + res );
				
				
			}
			
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			JDBCUtil.close(stmt, rs, conn);
		}
		
		
	}
	

}
