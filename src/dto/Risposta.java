package dto;

public class Risposta {

	private String descr;
	private boolean rispCorretta;
	
	public Risposta() {
		
	}

	public Risposta(String descr, boolean rispCorretta) {
		super();
		this.descr = descr;
		this.rispCorretta = rispCorretta;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public boolean isRispCorretta() {
		return rispCorretta;
	}

	public void setRispCorretta(boolean rispCorretta) {
		this.rispCorretta = rispCorretta;
	}

	@Override
	public String toString() {
		return "Risposta [descr=" + descr + ", rispCorretta=" + rispCorretta + "]";
	}
		
}
