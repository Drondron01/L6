package GB.nterview.L6;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/*
	public class ConfigServlet extends HttpServlet {
 
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	resp.setContentType("text/html;charset=utf-8");
 
 	        PrintWriter pw = resp.getWriter();
     	 	pw.println("<H1>Hello, world!!!!!</H1>");
 
    }
*/
	@WebServlet("/hello")
	public class ConfigServlet extends HttpServlet {

   	@Override
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       resp.setContentType("text/html");
	       PrintWriter printWriter = resp.getWriter();
	       printWriter.write("Hello world");
	       printWriter.close();
   }


}

// Запуск
// cd d:\java
// javac -encoding UTF-8 -cp .;servlet-api.jar GB\nterview\L6\ConfigServlet.java
//  http://localhost:8080/hello