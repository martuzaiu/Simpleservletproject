package school.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XmlServlet
 */
@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String userName = request.getParameter("userName");

		writer.println("Hello from get! " + userName);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");

		writer.println("Hello from post!<br>" + userName
				+ "<br>Your fullname : " + fullName);

		String prof = request.getParameter("prof");

		writer.println("<br>Your Profession : " + prof);
		
		//String location = request.getParameter("location");
		
		String[] location = request.getParameterValues("location");

		writer.println("<br>Your are at : " + location.length + " places: ");
		
		for (int i = 0; i < location.length; i++) {
			writer.print(location[i] + " ");
		}

	}

}
