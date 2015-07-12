package ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;
@Entity
public class Projekty {

	@Id
	@GeneratedValue
	private long id;
	private String nazwa;
	@ManyToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
@JoinTable(name="proacwnicy_w_projektach",
joinColumns ={@JoinColumn(name = "aaa")},inverseJoinColumns ={@JoinColumn(name = "bbb")})
	
	private List<Pracownicy1> pracownicy12;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Pracownicy1> getPracownicy() {
		return pracownicy12;
	}

	public void setPracownicy(List<Pracownicy1> pracownicy) {
		this.pracownicy12 = pracownicy;
	}

}
