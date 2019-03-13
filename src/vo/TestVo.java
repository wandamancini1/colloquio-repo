package vo;

import java.time.LocalDate;
import java.util.List;
import java.util.Timer;

public class TestVo {

	//da tipologia a data sono primary key
	private TipologiaVo tipologia;
	private CandidatoVo candidato;
	private LocalDate data;
	private List<DomandaVo> domande;
	private List<List<Object>> risposteUtente;
	
	// applicare timer in seguito (?) private int time;
	public TestVo() {
	}
	
	public TestVo(TipologiaVo tipologia, CandidatoVo candidato, LocalDate data, List<DomandaVo> domande,
			List<List<Object>> risposteUtente) {
		super();
		this.tipologia = tipologia;
		this.candidato = candidato;
		this.data = data;
		this.domande = domande;
		this.risposteUtente = risposteUtente;
	}
	
	public TipologiaVo getTipologia() {
		return tipologia;
	}
	
	public void setTipologia(TipologiaVo tipologia) {
		this.tipologia = tipologia;
	}
	
	public CandidatoVo getCandidato() {
		return candidato;
	}
	
	public void setCandidato(CandidatoVo candidato) {
		this.candidato = candidato;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public List<DomandaVo> getDomande() {
		return domande;
	}
	
	public void setDomande(List<DomandaVo> domande) {
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
		return "TestDto [data=" + data + ", risposteUtente=" + risposteUtente + "]";
	}
	
}
