import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import OneToOne.DodatkoweDane;
import domain.AdditionalData;
import domain.Employee;

public class TriggersAdRefreshDarabase {
	
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory em = Persistence.createEntityManagerFactory("mojaBaza");

	EntityManager emm = em.createEntityManager();
	
	
	Employee pr = new Employee();

	AdditionalData aa = new AdditionalData();
	pr.setImie("Daniel");
	pr.setNazwisko("Turek");
	pr.setAdditionalDatas(aa);
	pr.setWyplata(2000.0);
	
	
	emm.getTransaction().begin();
	emm.persist(pr);
	
	
	emm.getTransaction().commit();
	
	System.out.println("Imie "+ pr.getImie());
	System.out.println("Nazwisko "+ pr.getNazwisko());
	System.out.println("wyplata "+ pr.getWyplata());
	
	System.out.println("Podatek "+ pr.getPodatek());

	emm.refresh(pr);  // przeładowanie widoku w bazie danych
	
	System.out.println("Imie "+ pr.getImie());
	System.out.println("Nazwisko "+ pr.getNazwisko());
	System.out.println("wyplata "+ pr.getWyplata());
	System.out.println("Podatek " + pr.getPodatek());
	
	
	emm.getTransaction().begin();
	emm.remove(emm.find(Employee.class, 5L));  // usuniecie pracownika o ID =5
	
	emm.getTransaction().commit();
	
	
	
	emm.close();
	em.close();
}
}
