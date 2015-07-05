import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Employee;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory em = Persistence.createEntityManagerFactory("mojaBaza");

		EntityManager emm = em.createEntityManager();
		
		GregorianCalendar data = new GregorianCalendar();
		data.getTime();

		Employee pracownik = new Employee();
		//Employee pracownik2 = new Employee();

		// pracownik.setId(1l);
		pracownik.setImie("kamil");
		pracownik.setNazwisko("jakis tam");
		pracownik.setWyplata(33.33);
		pracownik.setZipCode("99-444");
		pracownik.setStreet("Kolorowa");
		pracownik.setStreetNumber("33");
		pracownik.setLocality("warszawa");
		pracownik.setBorn(data.getTime());
		

		//pracownik2.setImie("222");
		//pracownik2.setNazwisko("2222");
		//pracownik2.setWyplata(33.33);

		emm.getTransaction().begin();
		emm.persist(pracownik);
	//	emm.persist(pracownik2);
		emm.getTransaction().commit();

		emm.close();
		em.close();

	}

}
