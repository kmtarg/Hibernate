package RelationTests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import OneToMany.Car;
import OneToMany.Owner;

public class OneToManyTest {

	public static void main(String[] args) {
		
		
		EntityManagerFactory EntityManager = Persistence.createEntityManagerFactory("mojaBaza");
		EntityManager manager = EntityManager.createEntityManager();
		
		Car auto1 = new Car();
		Car auto2 = new Car();
		
		List<Car> auta = new ArrayList<>();
		auta.add(auto1);
		auta.add(auto2);
		
		Owner wlsaciciel = new Owner();
		
		wlsaciciel.setFirstName("Kamil");
		wlsaciciel.setCars(auta);
		wlsaciciel.setLastName("Kamilowski");
		
		
		manager.getTransaction().begin();
		manager.persist(wlsaciciel);
		manager.persist(auto1);
		manager.persist(auto2);
		manager.getTransaction().commit();
		manager.refresh(wlsaciciel);

		manager.close();
		EntityManager.close();
	}
}
