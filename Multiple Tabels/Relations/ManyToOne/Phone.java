package ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceContext;

@Entity
public class Phone {
@Id
@GeneratedValue
	private long id;
	private String typ;
	private String numer;
	@ManyToOne
	private Owner3 owner;
	

	public long getId() {
		return id;
	}









	public void setId(long id) {
		this.id = id;
	}









	public String getTyp() {
		return typ;
	}









	public void setTyp(String typ) {
		this.typ = typ;
	}









	public String getNumer() {
		return numer;
	}









	public void setNumer(String numer) {
		this.numer = numer;
	}









	public Owner3 getOwner() {
		return owner;
	}









	public void setOwner(Owner3 owner) {
		this.owner = owner;
	}









	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
 	
}
