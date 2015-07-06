import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Employee;

public class GetAndEditDataFromTable {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("mojaBaza");

		EntityManager emm = em.createEntityManager();
		
		
		emm.getTransaction().begin();
		
		Employee prac = emm.find(Employee.class, 1L);
		
		System.out.println("pracownik imie " + prac.getImie());
		
		
		prac.setStreet("nowo zmieniona");
		
		emm.getTransaction().commit();
		
		emm.close();
		em.close();
		
	}

}
