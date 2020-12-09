package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calcula.Calculadora;
import calcula.CalculadoraMain;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		CalculadoraMain calcPpal = new CalculadoraMain();
		Calculadora constructor = new Calculadora();

		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		if (num2 == 0) {
			request.setAttribute("msj", request.getParameter("msj"));
		}
		String cOpcion = request.getParameter("opcion");

		constructor.setOperador1(num1);
		constructor.setOperador2(num2);
		constructor.setOpcion(cOpcion);
		calcPpal.setCalc(constructor);
		double nResultado = calcPpal.calcular();

		request.setAttribute("result", String.format("%.4f", nResultado));

		request.setAttribute("num1", request.getParameter("num1"));
		request.setAttribute("num2", request.getParameter("num2"));
		request.setAttribute("opcion", request.getParameter("opcion"));

		RequestDispatcher miDispatcher = request.getRequestDispatcher("index.jsp");
		miDispatcher.forward(request, response);

		// response.sendRedirect(request.getContextPath() + "index.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
