package veriTabaniProject1;

import java.sql.*;


public class Kayit{
	private String id,parola;

	public Kayit(String id, String parola) {
		this.id=id;
		this.parola=parola;
	}
	
	public void KayitIslemi() throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mariadb://localhost:3306/kullanici?user=root&password=123");
		
		String sorgu="INSERT INTO kullanicibilgileri(id,parola) VALUES (?,?)";
		PreparedStatement pt=c.prepareStatement(sorgu);
		pt.setString(1, this.id);
		pt.setString(2, this.parola);
	}
	
}
