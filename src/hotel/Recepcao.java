package hotel;

import java.util.ArrayList;

public class Recepcao {
	private ArrayList estadias;
	
	public Recepcao() {
		this.estadias = new ArrayList();
		
	}
	
	public void checkIn(String nome, String tipo, int dias, double valor) {
		this.estadias.add(Estadia(nome, tipo, dias, valor));
	}
	public void checkOut(String nome) {
		//if (nome.equals(estadias))
		
		//this.estadias.remove(nome);
		
		
	}
	public int getNumDeHospedes() {
		return estadias.size();
		
	}
	public double getLucroTotal() {
		
	}
	@Override
	public String toString() {
		
	}
	
}
