package src.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import src.model.Utenti;
import src.service.UtentiService;

@WebServlet(urlPatterns = {"/utenti"})
public class UtentiServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private UtentiService service = new UtentiService();

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Utenti> users = new ArrayList<>();
		users = service.getUser();
		
		Gson gson = new Gson();
		String userJSON = gson.toJson(users);
		
		PrintWriter pw = res.getWriter();
		res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
		pw.write(userJSON);
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
