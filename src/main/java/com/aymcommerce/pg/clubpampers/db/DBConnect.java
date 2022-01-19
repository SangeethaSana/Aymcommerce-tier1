package com.aymcommerce.pg.clubpampers.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect extends ConnectionManager {

	public Connection EstablishConnection() {
		try {
			return DriverManager.getConnection(ManageServerConnect());
		} catch (SQLException e) {
			System.out.println("Connection Lost With Database " + e.getMessage());
			return null;
		}
	}
}
