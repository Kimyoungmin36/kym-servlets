package org.kym.servlets.examples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = "김영민";
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,
				response);
	}
}

