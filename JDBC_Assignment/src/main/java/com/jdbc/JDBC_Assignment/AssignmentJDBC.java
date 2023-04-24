package com.jdbc.JDBC_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AssignmentJDBC {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/jdbcassignment", "root", "12345");
			if(con==null)
				System.out.println("connection mot establish");
			else 
				System.out.println("connection established");
			    
			//CREATE TABLE
			
			String q="create table student(id int primary key,name varchar(20),marks int)";
			psmt=con.prepareStatement(q);
			psmt.executeUpdate();

			System.out.println("Table Created");
			}
			 

			//RECORD INSERT

			/*
			 String q="insert into student values(?,?,?)";
			 psmt=con.prepareStatement(q);


			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter How Many Student U Want");
			 int n=sc.nextInt();
			 for(int i=1;i<=n;i++)
			 {

			 System.out.println("Enter id,name,Marks");
			 int id=sc.nextInt();
			 String name=sc.next();
			 int marks=sc.nextInt();

			psmt.setInt(1,id);
			psmt.setString(2,name);
			psmt.setInt(3, marks);
			psmt.executeUpdate();
			System.out.println("Record Inserted");
			 }
			 */


			//UPDATE RECORD
			/* String q="update student set name=?where id=?";
			 psmt=con.prepareStatement(q);

			 psmt.setString(1, "Sita");
			 psmt.setInt(2, 101);

			 psmt.execute();

			 System.out.println("Record Inserted");

			 */

			//DELETE UPDATE
			//			 String q="delete from student where id=?";
			//			 psmt=con.prepareStatement(q);
			//			 
			//			 psmt.setInt(1,101);
			//			
			//			 psmt.execute();
			//			 
			//			 System.out.println("Record Inserted");


			
		catch(SQLException e)
		{ 
			e.printStackTrace();

		}

	 }
}	




