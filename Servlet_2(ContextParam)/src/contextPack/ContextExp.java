package contextPack;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ContextExp extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		ServletContext ctx=req.getServletContext();
		String uid=ctx.getInitParameter("userid").toString();
		String pw=ctx.getInitParameter("password").toString();
		String ui=req.getParameter("em");
		String pas=req.getParameter("pw");
		if(uid.equals(ui) && pw.equals(pas)) {
			res.sendRedirect("home");
		}
		else {
			res.sendRedirect("index.html");
		}
	}
	
}
