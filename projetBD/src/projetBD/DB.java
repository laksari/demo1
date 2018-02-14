package projetBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	
	public void insertPatientV1() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root" );
		
		String str="INSERT INTO PATIENT VALUES (102,'aaa','bbb')";
		//System.out.println(str);
		Statement st=conn.createStatement();
		st.executeUpdate(str);

	}
	
	
	public void insertPatientV2(int id, String nom, String prenom) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root" );
		
		String str="INSERT INTO PATIENT VALUES ("+id+",'"+nom+"','"+prenom+"')";
		//System.out.println(str);
		Statement st=conn.createStatement();
		st.executeUpdate(str);
	}
	
	
	public void insertPatientV3(int id, String nom, String prenom) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root" );
		
		String str="INSERT INTO PATIENT VALUES ("+id+",'"+nom+"','"+prenom+"')";
		//System.out.println(str);
		PreparedStatement ps=conn.prepareStatement("INSERT INTO PATIENT VALUES (?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, nom);
		ps.setString(3, prenom);
		ps.executeUpdate();
	}
	
	
	
	public 	String selectPatientV1() throws Exception{
		
		String resultat="ID\tNOM\tPRENOM\n";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root" );
		
		String str="SELECT * FROM PATIENT ";
		//System.out.println(str);
		Statement st=conn.createStatement();
		ResultSet rs = st.executeQuery(str);
		
		while(rs.next()){
			resultat+= rs.getInt(1)+"\t";
			resultat+= rs.getString("nom")+"\t";
			resultat+= rs.getString("prenom")+"\n";
		}
		
		return resultat;
	}

}
