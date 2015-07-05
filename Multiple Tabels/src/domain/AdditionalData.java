package domain;

import javax.persistence.Embeddable;

@Embeddable // klasa osadzona
public class AdditionalData {
	public String kraj;
	public String kontynent;
	public int pesel;

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getKontynent() {
		return kontynent;
	}

	public void setKontynent(String kontynent) {
		this.kontynent = kontynent;
	}

	public int getPesel() {
		return pesel;
	}

	public void setPesel(int pesel) {
		this.pesel = pesel;
	}
}
