package com.peanut.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	 static { 
	        try { 
	            Class.forName("oracle.jdbc.driver.OracleDriver"); 
	        } catch(Exception e) { 
	            e.printStackTrace(); 
	        } 
	    } 
	    
	    @Test 
	    public void testConnection() { 
	    	//given when then 패턴
	    	//given(필요한 데이터 준비)
	    	String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
	        String id = "jmj3047";
	        String password = "0001";
	        
	        //when 실행:test함
	        try(Connection con = DriverManager.getConnection( 
	                url, 
	                id, 
	                password)){
        	//then
	            System.out.println(con); 
	        } catch (Exception e) { 
	            fail(e.getMessage()); 
	        } 
	    
	    }    
}
