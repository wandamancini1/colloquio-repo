package dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Timer;

public class TestDto {

	private Tipologia tipologia;
	private Candidato candidato;
	private LocalDate data;
	private List<Domanda> domande;
	private List<List<Object>> risposteUtente;
	
	// applicare timer in seguito (?) private int time;
	public TestDto() {
	}
	
	public TestDto(Tipologia tipologia, Candidato candidato, LocalDate data, List<Domanda> domande,
			List<List<Object>> risposteUtente) {
		super();
		this.tipologia = tipologia;
		this.candidato = candidato;
		this.data = data;
		this.domande = domande;
		this.risposteUtente = risposteUtente;
	}
	
	public Tipologia getTipologia() {
		return tipologia;
	}
	
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}
	
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public List<Domanda> getDomande() {
		return domande;
	}
	
	public void setDomande(List<Domanda> domande) {
		this.domande = domande;
	}
	public List<List<Object>> getRisposteUtente() {
		return risposteUtente;
	}
	
	public void setRisposteUtente(List<List<Object>> risposteUtente) {
		this.risposteUtente = risposteUtente;
	}

	@Override
	public String toString() {
		return "TestDto [tipologia=" + tipologia + ", candidato=" + candidato + ", data=" + data + ", domande="
				+ domande.toString() + ", risposteUtente=" + risposteUtente.toString() + "]";
	}
	
	
	
}
