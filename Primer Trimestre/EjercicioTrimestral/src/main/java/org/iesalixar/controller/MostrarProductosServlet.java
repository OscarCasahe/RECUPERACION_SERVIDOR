package org.iesalixar.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.ProductsDAO;
import org.iesalixar.dao.ProductsDAOImpl;
import org.iesalixar.model.Product;

/**
 * Servlet implementation class MostrarProductosServlet
 */
@WebServlet("/MostrarEmpleadosServlet")
public class MostrarProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarProductosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String productLine =   request.getParameter("tipo");
		

		ProductsDAO productDao = new ProductsDAOImpl();
		
		List<Product> productos = productDao.getProductx(productLine);
		
		
		request.setAttribute("productLine", productLine);
		request.setAttribute("productos", productos);
		
		request.getRequestDispatcher("/WEB-INF/views/mostrarProductos.jsp").forward(request, response);
	}

}
