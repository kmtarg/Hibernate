package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Parcownicy")
@SecondaryTable(name = "Adresy", pkJoinColumns = @PrimaryKeyJoinColumn(name = "employeeId") )
// rozbicie na inne tabele , pkJoin... przypisanie nazwy do ID
public class Employee { //

	@Column(name = "Imie")
	private String imie;
	@Column(name = "Nazwisko")
	private String nazwisko;
	@Column(name = "Wyplata")
	private double wyplata;
	@Id
	@GeneratedValue
	private long id;

	
	
	@Column(table = "Adresy", name = "miejscowosc")
	private String locality;
	@Column(table = "Adresy", name = "kodPocztowy")
	private String zipCode;
	@Column(table = "Adresy", name = "ulica")
	private String street;

	
	@Embedded
	private AdditionalData additionalDatas ;
	
	
	@Column(table = "Adresy", name = "nrDomu")
	private String streetNumber;
	@Temporal(TemporalType.DATE)
	@Column(table = "Adresy", name = "urodzony")
	private Date born;
	@Column(table = "Adresy", name = "kiedyHajtniety")
	private java.sql.Date married;
	
	private long podatek;
	


	public long getPodatek() {
		return podatek;
	}

	public Date getBorn() {
		return born;
	}

	public AdditionalData getAdditionalDatas() {
		return additionalDatas;
	}

	public void setAdditionalDatas(AdditionalData additionalDatas) {
		this.additionalDatas = additionalDatas;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public java.sql.Date getMarried() {
		return married;
	}

	public void setMarried(java.sql.Date married) {
		this.married = married;
	}

	

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
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

	public double getWyplata() {
		return wyplata;
	}

	public void setWyplata(double wyplata) {
		this.wyplata = wyplata;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
