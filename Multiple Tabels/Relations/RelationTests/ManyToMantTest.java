package RelationTests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ManyToMany.Pracownicy1;
import ManyToMany.Projekty;

public class ManyToMantTest {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mojaBaza");
		EntityManager manager = factory.createEntityManager();

		Pracownicy1 p1 = new Pracownicy1("Adam", "Adamowski");
		Pracownicy1 p2 = new Pracownicy1("Daniel", "Danielewski");
		Pracownicy1 p3 = new Pracownicy1("Michał", "Michałowski");
		Pracownicy1 p4 = new Pracownicy1("Marek", "Marecki");
		Pracownicy1 p5 = new Pracownicy1("Jurek", "Jurkowski");
		Pracownicy1 p6 = new Pracownicy1("Olaf", "Olafowski");

		List<Pracownicy1> grupa1 = new ArrayList<>();
		grupa1.add(p1);
		grupa1.add(p2);
		grupa1.add(p3);

		List<Pracownicy1> grupa2 = new ArrayList<>();
		grupa2.add(p4);
		grupa2.add(p5);
		grupa2.add(p6);

		Projekty projekt1 = new Projekty();

		projekt1.setNazwa("jeden");
		projekt1.setPracownicy(grupa1);
		Projekty projekt2 = new Projekty();

		projekt2.setNazwa("dwa");
		projekt2.setPracownicy(grupa2);

		manager.getTransaction().begin();

		manager.persist(projekt1);
		manager.persist(projekt2);

//		manager.persist(p1);
//		manager.persist(p2);
//		manager.persist(p3);
//		manager.persist(p4);
//		manager.persist(p6);
//		manager.persist(p5);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}
}
