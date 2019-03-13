package dto;

public class Tipologia {

	private String posizione;
	
	/* esempio enum: (????) public enum Posizione {JavaJunior, JavaSenior
	} */
	
	// implementazione timer totale (?)
	
	public Tipologia() {
		
	}

	public Tipologia(String posizione) {
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
