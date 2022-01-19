package com.aymcommerce.pg.clubpampers.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Queryprocessor extends DBConnect {

	public PreparedStatement getPreparedStatement(String Statement) {
		try {
			return EstablishConnection().prepareStatement(Statement);
		} catch (SQLException e) {
			System.out.println("Failed to connect to DB !! " + e.getStackTrace());
			return null;
		}
	}

	public ResultSet executeQuery(String QueryStatement) throws SQLException {
		return getPreparedStatement(QueryStatement).executeQuery();
	}

	public void updateExecuteQuery(String UpdateQueryStatement) throws SQLException {
		try {
			getPreparedStatement(mConfig.getProperty("UpdateQuery") + UpdateQueryStatement).executeQuery();
		} catch (Exception e) {
		}
	}

	public void FBupdateExecuteQuery(String UpdateQueryStatement) throws SQLException {
		try {
			getPreparedStatement(mConfig.getProperty("FBUpdateQuery") + UpdateQueryStatement).executeQuery();
		} catch (Exception e) {
		}
	}
}
