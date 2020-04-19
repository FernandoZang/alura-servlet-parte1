package dao;

import java.util.ArrayList;
import java.util.List;

import model.Empresa;

public class EmpresaDAO {
	private static List<Empresa> empresas = new ArrayList<>();
	
	
	public void add(Empresa e) {
		EmpresaDAO.empresas.add(e);
	}
	
	
	public List<Empresa> getAll() {
		return EmpresaDAO.empresas;
	}
	
	
	
	
	
	
}
