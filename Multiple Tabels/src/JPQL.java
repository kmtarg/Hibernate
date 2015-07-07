

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import domain.AdditionalData;
import domain.Employee;

public class JPQL {
	
	static EntityManagerFactory em = Persistence.createEntityManagerFactory("mojaBaza");

	 static EntityManager emm = em.createEntityManager();
	

	
	public static void main(String[] args) {
		
		//setSampleEmployee();
		
		// parametr nazwany
		TypedQuery<Employee> query1 = emm.createQuery("select e from Employee e where e.wyplata >:minWyplata",Employee.class);
		query1.setParameter("minWyplata", 2000.0);
		
		
		// parametry nienazwane
		TypedQuery<Employee> query2 = emm.createQuery("select e from Employee e where e.wyplata >?1 and e.wyplata <?2",Employee.class);
		query2.setParameter(1, 1000.0);
		query2.setParameter(2, 3000.0);
		
		
		List<String> lista = new ArrayList<>();
		lista.add("Michałowski");
		lista.add("Danielewski");
		
		// lista parametrów
		TypedQuery<Employee> query3 = emm.createQuery("select e from Employee e where e.nazwisko in :names",Employee.class);
		query3.setParameter("names", lista);
		
		
		
		
		
		
		for (Employee emplo : query1.getResultList()) {
			System.out.println(emplo.getImie());
			System.out.println(emplo.getNazwisko());
			System.out.println(emplo.getWyplata());
			System.out.println();
			
		}
		for (Employee emplo : query2.getResultList()) {
			System.out.println(emplo.getImie());
			System.out.println(emplo.getNazwisko());
			System.out.println(emplo.getWyplata());
			System.out.println();
			
		}
		for (Employee emplo : query3.getResultList()) {
			System.out.println(emplo.getImie());
			System.out.println(emplo.getNazwisko());
			System.out.println(emplo.getWyplata());
			System.out.println();
			
		}
		
		
		
		emm.close();
		em.close();
		
		
		
	}
	
	public static void addEmployee(String firstName,String lastName, double salary){
		
		Employee pracownik = new Employee();
		AdditionalData data = new AdditionalData();
		pracownik.setImie(firstName);
		pracownik.setNazwisko(lastName);
		pracownik.setWyplata(salary);
		pracownik.setAdditionalDatas(data);
		emm.getTransaction().begin();
		emm.persist(pracownik);
		emm.getTransaction().commit();
		
	}
	
	public static void setSampleEmployee(){
		addEmployee("Janek", "Nwakowski", 2000);
		addEmployee("Michał", "Michałowski", 3000);
		addEmployee("Kamil", "Kamilowski", 1234);
		addEmployee("Daniel", "Danielewski", 4563);
	}
	
	
}


