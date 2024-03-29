package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.model.*;
import com.demo.services.*;

@WebServlet("/addnewemp")
public class AddNewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("empid"));
		String ename = request.getParameter("ename");
		int sal = Integer.parseInt(request.getParameter("sal"));
		Employee e1 = new Employee(empid, ename, sal);
		EmpService eservice = new EmpServiceImpl();
		eservice.addnewemp(e1);
		RequestDispatcher rd = request.getRequestDispatcher("employees");
		rd.forward(request, response);
	}

}
