package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PassController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*System.out.println("PassController ���� �۵�");
		String mode = req.getParameter("mode");
		System.out.println(mode);
		*/
		
		//mode : edit <== �ۼ���, mode : delete <== �ۻ���
		req.setAttribute("mode", req.getParameter("mode"));
		req.getRequestDispatcher("/mvcboard/pass.jsp").forward(req, resp);
		
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}

	
	
}
