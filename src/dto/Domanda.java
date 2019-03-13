package dto;

import java.util.List;

public class Domanda {

	private String descrizione;
	private List<Risposta> risposte;
	
	public Domanda() {
		
	}

	public Domanda(String descrizione, List<Risposta> risposte) {
		super();
		this.descrizione = descrizione;
		this.risposte = risposte;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public List<Risposta> getRisposte() {
		return risposte;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setRisposte(List<Risposta> risposte) {
		this.risposte = risposte;
	}

	@Override
	public String toString() {
		return "Domanda [descrizione=" + descrizione + ", risposte=" + risposte.toString() + "]";
	}
	
	
	
}
