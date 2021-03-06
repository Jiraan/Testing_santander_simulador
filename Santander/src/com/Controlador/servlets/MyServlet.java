package com.Controlador.servlets;

import com.Modelo.clases.Banco;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		if(request.getParameter("aportecontado")!=""&&request.getParameter("valorpropiedad")!="")
		{
		Banco banco = new Banco();
	    banco.setAporte_C(Integer.parseInt(request.getParameter("aportecontado")));
	    banco.setValor_P(Integer.parseInt(request.getParameter("valorpropiedad")));
	    request.setAttribute("Banco", banco);
		}
	    try(PrintWriter out=response.getWriter()){
	    	RequestDispatcher a= request.getRequestDispatcher("credito.jsp");
	    	a.forward(request, response);
	    }
	    
		
	}

}
