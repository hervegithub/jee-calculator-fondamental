package com.calculatrice.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculatrice.Bean.CalculatriceBean;


@WebServlet("/CalculatriceServlet")
public class CalculatriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CalculatriceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Calculatrice.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String signe;
		signe = (String)request.getParameter("signe");
		request.setAttribute("signe", signe);
		
		String nombre1= (String) request.getParameter("nombre1");
		String nombre2= (String) request.getParameter("nombre1");
		CalculatriceBean calculatrice = new CalculatriceBean();
		
		calculatrice.superComputer(nombre1, nombre2, signe);
		
		String result= calculatrice.getLogMessage();
		request.setAttribute("resultat", result);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Calculatrice.jsp").forward(request, response);
		
	}

}
