package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s1")
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();
		Connection con;
		Statement s;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			pw.println("Driver loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin\\@:localhost:1521:xe", "system", "karuna");
			pw.println("Driver loaded...");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

}
