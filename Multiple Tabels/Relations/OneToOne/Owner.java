package OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Owner {
	@Id
	@GeneratedValue
	private long id;
	private String imie;
	private String nazwisko;
	@OneToOne
	@JoinColumn(name = "id_item")
	private Item item;

	public Owner() {

	}

	public Owner( String imie, String nazwisko, Item item) {
		super();
	
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.item = item;
	}

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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
