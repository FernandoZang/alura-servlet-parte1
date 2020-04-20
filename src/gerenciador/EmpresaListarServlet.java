package gerenciador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpresaDAO;
import model.Empresa;


@WebServlet("/EmpresaListar")
public class EmpresaListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EmpresaListarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		List<Empresa> empresas = empresaDAO.getAll();
		
		request.setAttribute("empresas", empresas);
		
		request.getRequestDispatcher("/EmpresaListagem.jsp").forward(request, response);
	}

	
}
