package com.aymcommerce.pg.clubpampers.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetScanCodes extends Queryprocessor {

	public String getscancodes(ResultSet resultSet) throws SQLException {
		if (!resultSet.next()) {
			System.out.println("There is no data in the database!");
			return "";
		}
		return resultSet.getString("Code");
	}

	public String[] getFBinfo(ResultSet resultSet) throws SQLException {
		String[] val = new String[3];
		if (!resultSet.next()) {
			System.out.println("There is no data in the database!");
			return val;
		}
		val[0] = resultSet.getString("Email");
		val[1] = resultSet.getString("Password");
		return val;
	}

	public String get_US_Unused_Codes() throws SQLException {
		String getscancodes = getscancodes(executeQuery(mConfig.getProperty("Get_Unused_Code")));
		new GetScanCodes().updateExecuteQuery(getscancodes + "';");
		return getscancodes;
	}

	public String get_Scan_Codes(String QueryKey) throws SQLException {
		String getscancodes = getscancodes(executeQuery(mConfig.getProperty(QueryKey)));
		new GetScanCodes().updateExecuteQuery(getscancodes + "';");
		System.out.println("DB Code Used : " + getscancodes);
		return getscancodes;
	}
}
