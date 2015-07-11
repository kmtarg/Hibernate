package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.TableGenerator;

@Entity
public class Pracownicy1 {
	@Id
	@TableGenerator(name = "GENERATOR", 
	table = "Tabela_z_identyfikatorami", 
	pkColumnName = "NazKol", 
	pkColumnValue = "ValKol", 
	valueColumnName = "valKOlName",
	initialValue= 100,
	allocationSize=500
	
			
			
			)
	@GeneratedValue(strategy = GenerationType.TABLE,generator="GENERATOR")
	private long id;
	private String imie;
	private String nazwisko;
	@ManyToMany(mappedBy = "pracownicy12")
	private List<Projekty> projekt12;

	public double getId() {
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

	public List<Projekty> getProjekt() {
		return projekt12;
	}

	public void setProjekt(List<Projekty> projekt) {
		this.projekt12 = projekt;
	}

	public Pracownicy1(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;

	}

	public Pracownicy1() {

	}

}
