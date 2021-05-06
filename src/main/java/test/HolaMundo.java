package test;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Persistence;

import mx.com.gm.domain.Persona;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hql="SELECT P FROM Persona P";
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
		EntityManager entityManager = fabrica.createEntityManager();
		
		Query query = entityManager.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Persona> personas = query.getResultList();
		
		for(Persona p: personas) {
			System.out.println("Persona: "+p);
		}
	}

}
