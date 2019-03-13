package vo;

public class TipologiaVo {

	private String posizione;
	
	/* esempio enum: (????) public enum Posizione {JavaJunior, JavaSenior
	} */
	
	// implementazione timer totale (?)
	
	public TipologiaVo() {
		
	}

	public TipologiaVo(String posizione) {
		super();
		this.posizione = posizione;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	@Override
	public String toString() {
		return "Tipologia [posizione=" + posizione + "]";
	}
	
	
}
