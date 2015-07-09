package RelationTests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ManyToOne.Owner3;
import ManyToOne.Phone;

public class ManyToOneTest {
	
	public static void main(String[] args) {
		
		EntityManagerFactory EntityManager = Persistence.createEntityManagerFactory("mojaBaza");
		EntityManager manager = EntityManager.createEntityManager();
		
	
		Owner3 ow1 = new Owner3();
		
		ow1.setImie("Adam");
		ow1.setNazwisko("Adamowicz");
		
		Phone tel1 = new Phone();
	tel1.setNumer("1242343");
	tel1.setTyp("mobile");
	tel1.setOwner(ow1);
	
	Phone tel2 = new Phone();
	tel2.setNumer("1242343");
	tel2.setTyp("mobile");
	tel2.setOwner(ow1);
	

		
		manager.getTransaction().begin();
		manager.persist(ow1);
		manager.persist(tel1);
		manager.persist(tel2);
		
		
		manager.getTransaction().commit();		
		
		
		
		manager.close();
		EntityManager.close();
	}

}
