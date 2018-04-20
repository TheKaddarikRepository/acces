package data;

import java.sql.DriverManager;
import java.sql.SQLException;

import loging.RolesAvailable;

public class DBconnexion {
	private static Object driver = null;
	private static java.sql.Connection connexion;

	private DBconnexion(RolesAvailable role) {
		if (driver == null)
			try {
				driver = Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void getConnexion(RolesAvailable role) {
		if (connexion != null)
			try {
				connexion = DriverManager.getConnection(role.getURL(), role.getLogin(), role.getPassword());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
