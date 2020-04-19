package model;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empresa {
	
	private int id;
	private String nomeFantasia;
	private GregorianCalendar dataAbertura = new GregorianCalendar();
	
	
	
	
	
	
	public Empresa(String nomeFantasia, GregorianCalendar dataAbertura) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.dataAbertura = dataAbertura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public GregorianCalendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(GregorianCalendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
	
	
	

}
