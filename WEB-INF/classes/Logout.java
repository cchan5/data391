import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

//this just logsout and clears the session when a user logs out
public class Logout extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
                                throws ServletException, IOException {
		HttpSession session = request.getSession(false);
			if (session != null) {
    				session.invalidate();
			}
			response.sendRedirect("Home_Menu.jsp");
	}
}











