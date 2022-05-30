package org.iesalixar.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.ProductLineDAO;
import org.iesalixar.dao.ProductLineDAOImpl;
import org.iesalixar.model.ProductLine;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet(name = "InicioServlet", urlPatterns = { "/InicioServlet" })
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProductLineDAO plDAO = new ProductLineDAOImpl();
		
		ArrayList<ProductLine> productLines = plDAO.getAllProductLine();
		
		request.setAttribute("productLines", productLines);
		
		
		request.getRequestDispatcher("/WEB-INF/views/inicio.jsp").forward(request, response);
	}

}
