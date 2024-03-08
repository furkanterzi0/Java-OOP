package veriTabani;
import java.sql.*;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mariadb://localhost:3306/car?user=root&password=123");
		Statement st=c.createStatement();
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("araba adı: ");
		String name=input.nextLine();
		
		System.out.println("araba hızı: ");
		int speed=input.nextInt();
		/*
		String sorgu="INSERT INTO cars (cars_name,cars_speed) VALUES ('"+name+"',"+speed+")";
		
		int sonuc= st.executeUpdate(sorgu);
		System.out.println(sonuc);
		st.close();
		*/
		
		/*
		String q="INSERT INTO cars (cars_name,cars_speed) VALUES (?,?)";
		PreparedStatement pt=c.prepareStatement(q);
		pt.setString(1, name);
		pt.setInt(2, speed);
		pt.executeUpdate();
		*/
		
		ResultSet rs= st.executeQuery("SELECT * FROM cars");
		while(rs.next()) {
			System.out.println(rs.getInt("cars_id")+rs.getString("cars_name")+"-"+rs.getInt("cars_speed"));
		}
		
	}

}
