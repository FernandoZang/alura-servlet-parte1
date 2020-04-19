package gerenciador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpresaDAO;
import model.Empresa;


@WebServlet(urlPatterns= {"/EmpresaCadastrar"})
public class EmpresaCadastrarServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeFantasia = req.getParameter("nomeFantasia");
		String dataAbertura = req.getParameter("dataAbertura");
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		GregorianCalendar data = null;
		try {
			date = format.parse(dataAbertura);
			data = new GregorianCalendar();
			data.setTime(date);
			
			System.out.println("Nome Fantasia...: " + nomeFantasia);
			System.out.println("Data Abertura...: " + dataAbertura);
			
			
			Empresa empresa = new Empresa(nomeFantasia, data);
			EmpresaDAO empresaDAO = new EmpresaDAO();
			empresaDAO.add(empresa);
			
			List<Empresa> empresas = empresaDAO.getAll();
			req.setAttribute("empresas", empresas);
			
			RequestDispatcher rd = req.getRequestDispatcher("EmpresaListagem.jsp");
			rd.forward(req, resp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
