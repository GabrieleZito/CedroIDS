import GestioneMagazzino.Farmaco;

import java.util.Date;
import java.util.HashMap;

public class Ordine {
	private int ID_O;
	private Date dataConsegna;
	private String stato;
	private String tipo;

	public Ordine(int ID_O, Date dataConsegna, String stato, String tipo) {
		this.ID_O = ID_O;
		this.dataConsegna = dataConsegna;
		this.stato = stato;
		this.tipo = tipo;
	}

	public int getID_O() {
		return ID_O;
	}
	public void setID_O(int ID_O) {
		this.ID_O = ID_O;
	}
	public Date getDataConsegna() {
		return dataConsegna;
	}
	public void setDataConsegna(Date dataConsegna) {
		this.dataConsegna = dataConsegna;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}