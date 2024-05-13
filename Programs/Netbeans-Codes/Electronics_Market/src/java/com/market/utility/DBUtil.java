package com.market.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {
	private static Connection conn;

	public DBUtil() {
	}

	public static Connection provideConnection() {

		try {
			if (conn == null || conn.isClosed()) {
//				ResourceBundle rb = ResourceBundle.getBundle("application");
//				String connectionString = rb.getString("jdbc:mysql://localhost:3306/electronics");
//				String driverName = rb.getString("com.mysql.jdbc.Driver");
//				String username = rb.getString("root");
//				String password = rb.getString("admin123");
                                String connectionString = "jdbc:mysql://localhost:3306/shopping-cart";
                                String driverName = "com.mysql.jdbc.Driver";
                                String username = "root";
                                String password = "admin123";
				try {
					Class.forName(driverName);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				conn = DriverManager.getConnection(connectionString, username, password);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public static void closeConnection(Connection con) {
		/*
		 * try { if (con != null && !con.isClosed()) {
		 * 
		 * con.close(); } } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	public static void closeConnection(ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed()) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeConnection(PreparedStatement ps) {
		try {
			if (ps != null && !ps.isClosed()) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    
    
    
    
    
//     private static Connection conn;
//    
//    static {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Class Loaded Successfully");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adjava","root","admin123");
//            System.out.println("Connection opened Successfully");
//        } catch (Exception ex) {
//            System.out.println("Exception in opening connection: "+ex);
//        } 
//        
//    }
//    
//     public static void closeConnection(){
//        try {
//             conn.close();
//             System.out.println("DB Connection closed");
//        } catch (SQLException e) {
//            System.out.println("Error while closing the connection: "+e);
//        }
//    }
}
