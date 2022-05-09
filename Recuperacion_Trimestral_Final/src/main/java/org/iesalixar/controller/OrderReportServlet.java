package org.iesalixar.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOOrder;
import org.iesalixar.dao.DAOOrderDetails;
import org.iesalixar.dao.DAOOrderDetailsImpl;
import org.iesalixar.dao.DAOOrderImpl;
import org.iesalixar.model.Order;
import org.iesalixar.model.OrderDetail;

/**
 * Servlet implementation class OrderReportServlet
 */
@WebServlet("/OrderReportServlet")
public class OrderReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderReportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orderNumber = request.getParameter("on");
		
		DAOOrder daoOrder = new DAOOrderImpl();
		DAOOrderDetails daoOrderDetails = new DAOOrderDetailsImpl();
		
		Order order = daoOrder.getOrder(Integer.parseInt(orderNumber));
		ArrayList<OrderDetail> orderDetails = daoOrderDetails.getAllOrderDetailsFromOrder(Integer.parseInt(orderNumber));
		
		
		
		request.setAttribute("orderDetails", orderDetails);
		request.setAttribute("order", order);
		
		request.getRequestDispatcher("/WEB-INF/views/orderReport.jsp").forward(request, response);
	}

}
