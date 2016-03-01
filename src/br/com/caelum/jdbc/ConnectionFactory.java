package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import javax.management.RuntimeErrorException;

public class ConnectionFactory {
	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","JUDAHLIVE");
			
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
}
