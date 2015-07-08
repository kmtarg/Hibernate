package RelationTests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import OneToOne.Item;
import OneToOne.Owner;

public class OneToOneTest {

	
	public static void main(String[] args) {
		
		
		EntityManagerFactory EntityManager = Persistence.createEntityManagerFactory("mojaBaza");
		EntityManager manager = EntityManager.createEntityManager();
		
		
		
		
		Item przedmiot = new Item();
		przedmiot.setCena(3.2);
		przedmiot.setNazwa("puszka piwa");
		Owner wlaściciel = new Owner("Jan", "Abacki", przedmiot);
		
		
		
		manager.getTransaction().begin();
		manager.persist(wlaściciel);
		manager.persist(przedmiot);
		
		
		manager.getTransaction().commit();
		
		
		manager.close();
		EntityManager.close();
		
		
	}
}
