package com.tnsif.jdbc;

import java.sql.*;

public class DemoJdbc {

	public static void main(String[] args) throws Exception {

		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viit", "root", "admin");

		Statement st = con.createStatement();
		// process the result
		ResultSet rs = st.executeQuery("select * from Students");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "::" + rs.getString(2) + "::" + rs.getString(3));
		}
		con.close();

	}

}
