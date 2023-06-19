import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_demo {

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.150:3306/dac27_campus";
			Connection con=DriverManager.getConnection(url,"dac27","welcome");
			
			if(con!=null) {
				System.out.println("connection done");
			}else {
				System.out.println("Connection not done");
			}
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from course");
			
			while(rs.next()) {
				System.out.println(rs.getString(2));
				//System.out.println(rs.getInt(3));
			}
//			Statement st1=con.createStatement();
//			st1.executeUpdate("create table deepak(id Integer, name varchar(20))");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
