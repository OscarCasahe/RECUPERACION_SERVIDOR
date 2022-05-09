package org.iesalixar.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOOrder;
import org.iesalixar.dao.DAOOrderImpl;
import org.iesalixar.model.Order;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet("/InicioServlet")
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

		DAOOrder daoOrder = new DAOOrderImpl();
		
		ArrayList<Order> orders = daoOrder.getAllOrders();
		
		request.setAttribute("orders", orders);
		
		request.getRequestDispatcher("/WEB-INF/views/inicio.jsp").forward(request, response);
	}

}
