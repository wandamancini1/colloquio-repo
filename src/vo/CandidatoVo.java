package vo;

import java.time.LocalDate;

public class CandidatoVo {

	private String nome; // ***
	private String cognome; // ***
	// impostare con max 16 caratteri
	private String cf; // *** primary key
	private String email; // ***
	// vedere come impostare una data specifica
	private LocalDate dataDiNascita; // ***
	private String luogoNascita; // ***
	private String cittadinanza; // ***
	private String domicilio; // ***
	private String capDomicilio; // ***
	private String residenza; // ***
	private String capResidenza; // ***
	private String recapitoMobile; // ***
	private String recapitoFisso; // opzionale

	// da inserire poi condanne, invalidità e privacy
	// canale candidatura (prima o dopo test?)
	
	public CandidatoVo() {

	}

	public CandidatoVo(String nome, String cognome, String cf, String email, LocalDate dataDiNascita, String luogoNascita,
			String cittadinanza, String domicilio, String capDomicilio, String residenza, String capResidenza,
			String recapitoMobile, String recapitoFisso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.email = email;
		this.dataDiNascita = dataDiNascita;
		this.luogoNascita = luogoNascita;
		this.cittadinanza = cittadinanza;
		this.domicilio = domicilio;
		this.capDomicilio = capDomicilio;
		this.residenza = residenza;
		this.capResidenza = capResidenza;
		this.recapitoMobile = recapitoMobile;
		this.recapitoFisso = recapitoFisso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getCittadinanza() {
		return cittadinanza;
	}

	public void setCittadinanza(String cittadinanza) {
		this.cittadinanza = cittadinanza;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCapDomicilio() {
		return capDomicilio;
	}

	public void setCapDomicilio(String capDomicilio) {
		this.capDomicilio = capDomicilio;
	}

	public String getResidenza() {
		return residenza;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}

	public String getCapResidenza() {
		return capResidenza;
	}

	public void setCapResidenza(String capResidenza) {
		this.capResidenza = capResidenza;
	}

	public String getRecapitoMobile() {
		return recapitoMobile;
	}

	public void setRecapitoMobile(String recapitoMobile) {
		this.recapitoMobile = recapitoMobile;
	}

	public String getRecapitoFisso() {
		return recapitoFisso;
	}

	public void setRecapitoFisso(String recapitoFisso) {
		this.recapitoFisso = recapitoFisso;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", email=" + email
				+ ", dataDiNascita=" + dataDiNascita + ", luogoNascita=" + luogoNascita + ", cittadinanza="
				+ cittadinanza + ", domicilio=" + domicilio + ", capDomicilio=" + capDomicilio + ", residenza="
				+ residenza + ", capResidenza=" + capResidenza + ", recapitoMobile=" + recapitoMobile
				+ ", recapitoFisso=" + recapitoFisso + "]";
	}

}
