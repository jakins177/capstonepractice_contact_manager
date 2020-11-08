package com.geektechnique.contactmanager.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactManagerDB {
	String url;
	String user;
	String password;
	
	public ContactManagerDB() {
		super();
		this.url = "jdbc:postgresql://localhost:5432/contactmanagerDB";
		this.user = "postgres";
		this.password = "admin";
		
	}
	
	public void createUserRecord(String email, String password) {   
     
        String query = "INSERT INTO users(email, password) VALUES(?,?)";

        try (Connection con = DriverManager.getConnection(this.url, this.user, this.password);
             PreparedStatement pst = con.prepareStatement(query)) {
            
 
            pst.setString(1, email);
            pst.setString(2, password); 
            pst.executeUpdate();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
        }
		
		
		
		

	}

}
