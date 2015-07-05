package OneToOne;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pracownik {
	@Id
	@GeneratedValue
	private long id;
	
	private String imie;
	private String nazwisko;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adressID")
	private DodatkoweDane dodatek;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public DodatkoweDane getDodatek() {
		return dodatek;
	}
	public void setDodatek(DodatkoweDane dodatek) {
		this.dodatek = dodatek;
	}
	
	
	
	
	

}
