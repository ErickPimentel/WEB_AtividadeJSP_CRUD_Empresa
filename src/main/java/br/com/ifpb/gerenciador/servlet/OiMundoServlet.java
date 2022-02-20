package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Meu primeiro servlet!!!");
		out.println("</h1>");
		out.println("<h1>");
		out.println("Nome: "+ nome + " Sobrenome: " + sobrenome );
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		super.service(request, response);
	}

}
