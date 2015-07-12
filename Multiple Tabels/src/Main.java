import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import OneToOne.DodatkoweDane;
import OneToOne.Pracownik;
import domain.AdditionalData;
import domain.Employee;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory em = Persistence.createEntityManagerFactory("mojaBaza");

		EntityManager emm = em.createEntityManager();

		GregorianCalendar data = new GregorianCalendar();
		data.getTime();

		Employee pracownik = new Employee();
		Pracownik p = new Pracownik();

		DodatkoweDane dod = new DodatkoweDane();
		AdditionalData dodatek = new AdditionalData();

		// Employee pracownik2 = new Employee();

		// pracownik.setId(1l);
		pracownik.setImie("kamil");
		pracownik.setNazwisko("jakis tam");
		pracownik.setWyplata(33.33);
		pracownik.setZipCode("99-444");
		pracownik.setStreet("Kolorowa");
		pracownik.setStreetNumber("33");
		pracownik.setLocality("warszawa");
		pracownik.setBorn(data.getTime());
		pracownik.setAdditionalDatas(dodatek); // dodatkowe info z klasy
												// osadzonej

		p.setImie("darek");
		p.setNazwisko("nazwiskowicz");
		p.setDodatek(dod);

		// pracownik2.setImie("222");
		// pracownik2.setNazwisko("2222");
		// pracownik2.setWyplata(33.33);

		emm.getTransaction().begin();
		emm.persist(pracownik);
		// emm.persist(pracownik2);
		emm.persist(p);
		// emm.persist(dod); // dodajemy dodatkową encję która jest podpięta
		// przez one-to-one
		emm.getTransaction().commit();

		emm.close();
		em.close();

	}

}
