// Abhijeet Das - Assignment 6 WebTech

package net.codejava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class to create Http Servlet
@WebServlet("/NameFormServlet")
public class NameFormServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// read form fields
		String fname = request.getParameter("first_name");
		String lname = request.getParameter("last_name");
		
		System.out.println("First Name is: " + fname);
		System.out.println("Last Name is: " + lname);
		
		// get name initials function
		static void print_NameInitials(String name)
		{
        if (name.length() == 0)
            return;
        String words[] = name.split(" ");
        for(String word : words) {
            System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        }}
		// name initial function ends
		
		// feeding to function
		String name = fname + lname;
        String output = print_NameInitials(name);
		
		// get response writer
		PrintWriter writer = response.getWriter();
		
		// build HTML code
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Name Initials are: " + output + "<br/>";
        htmlResponse += "Last Name: " + fname + "<br/>"		
		htmlResponse += "Last Name: " + lname + "</h2>";		
		htmlResponse += "</html>";
		
		// return response
		writer.println(htmlResponse);
		
	}
}