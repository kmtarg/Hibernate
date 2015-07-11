package ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;

@Entity
public class Owner3 {

	@Id
	@GeneratedValue
	private long id;
	private String imie;
	private String nazwisko;
	@OneToMany(mappedBy="owner")
	private List<Phone> phones;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
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
	
	
	public Owner3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
