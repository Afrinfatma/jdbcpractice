package com.jdbcpractice;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DemoDb {

	           

			public static void main(String[] args) {
				String jdbcURL="jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
				String username="root";
				String password="Affoshakku@786";
				Connection con;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver loaded");
				}catch (ClassNotFoundException e) {
					throw new IllegalStateException("cannnot find the driver in the classs path:" ,e);
				}
			
			 listDrivers(); 
			 try {
				 System.out.println("Connectin to database" +jdbcURL);
			     con=DriverManager.getConnection(jdbcURL,username,password);
			     System.out.println("Connection is successful" +con);
			    }catch (Exception e){
				  e.printStackTrace();
				  } 
			 }
			private static void listDrivers() {
					  Enumeration<Driver> driverList=DriverManager.getDrivers();
			  while(driverList.hasMoreElements()) {
				  Driver driverClass=(Driver)driverList.nextElement();
			  System.out.println(" "+driverClass.getClass().getName()); 
			  } 
			  }
			 
			  
}
