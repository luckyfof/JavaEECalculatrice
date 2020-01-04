package ch.sunzof.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Calculatrice() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double nombre1 = Double.parseDouble(request.getParameter("nombre1"));
		double nombre2 = Double.parseDouble(request.getParameter("nombre2"));
		double resultat = 0;
		String operation = request.getParameter("operation");
		switch (operation) {
		case "+":
			resultat = nombre1 + nombre2;
			break;
		case "-":
			resultat = nombre1 - nombre2;
			break;
		case "*":
			resultat = nombre1 * nombre2;
			break;
		case "/":
			try {
				resultat = nombre1 / nombre2;
			} catch (ArithmeticException e) {
				resultat = 0;
			}
			break;
		}
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("operation", operation);
		request.setAttribute("nombre2", nombre2);
		request.setAttribute("resultat", resultat);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

}
