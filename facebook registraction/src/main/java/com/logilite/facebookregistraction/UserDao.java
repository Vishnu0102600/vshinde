package com.logilite.facebookregistraction;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
	static Connection con = null;
	static PreparedStatement stmt = null;

	public static int Save(UserInformation info)
	{
		int status = 0;

		try {
			con = DatabaseManager.initializeDatabase();
			stmt = con.prepareStatement("insert into facebookregistration values(?, ?,?,?,?,?,?)");

			stmt.setString(1, info.getEmail());
			stmt.setString(2, info.getMobile());
			stmt.setString(3, info.getPassword());
			stmt.setString(4, info.getName());
			stmt.setString(5, info.getSurname());
			stmt.setString(6, info.getDOB());
			stmt.setString(7, info.getGender());

			status = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return status;
	}

	public static int Update(UserInformation info)// 2
	{
		int status = 0;

		try {
			con = DatabaseManager.initializeDatabase();
			stmt = con.prepareStatement("update facebookregistration set password=? where email=? and mobile=?");
			stmt.setString(1, info.getPassword());

			stmt.setString(2, info.getEmail());
			stmt.setString(3, info.getMobile());

			status = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return status;
	}

	

}
