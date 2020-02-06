import java.io.*;
import javax.servlet.*;

public  class helloservlet extends GeniricServlet 
{
	public  void service(ServletRequest rsq,ServletRespons res)throws  ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		out.println("<B> WELCOME TO JIT");
		out.close();
	}
}